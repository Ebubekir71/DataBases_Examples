package traininfo;

public class UtilisationRecord {
    private final int trainNb;
    private final int position;
    private final char load;

    public UtilisationRecord(int trainNb, int position, char load) {
        this.trainNb = trainNb;
        this.position = position;
        this.load = load;
    }

    public int getTrainNb() {
        return trainNb;
    }

    public int getPosition() {
        return position;
    }

    public char getLoad() {
        return load;
    }
}
