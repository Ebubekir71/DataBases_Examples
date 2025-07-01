package traininfo;

public class UtilisationPredictor {

    private static UtilisationRecord[] records = new UtilisationRecord[0];

    public static void addRecord(int trainNb, int position, char load) {
        int len = records.length;
        UtilisationRecord[] newArray = new UtilisationRecord[len + 1];
        System.arraycopy(records, 0, newArray, 0, len);
        newArray[len] = new UtilisationRecord(trainNb, position, load);
        records = newArray;
    }

    public static char predict(int trainNb, int position) {
        for (UtilisationRecord r : records) {
            if (r.getTrainNb() == trainNb && r.getPosition() == position) {
                return r.getLoad();
            }
        }
        return '?';
    }

    public static void addData(int trainNb, String loads) {
        for (int i = 0; i < loads.length(); i++) {
            char load = loads.charAt(i);
            if (load == 'X') continue;
            addRecord(trainNb, i, load);
        }
    }
}
