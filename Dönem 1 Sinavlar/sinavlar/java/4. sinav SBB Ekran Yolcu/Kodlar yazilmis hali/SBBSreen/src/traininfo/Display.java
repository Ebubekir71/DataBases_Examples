package traininfo;

public class Display {
    private Train train;
    private int infoType = 0;
    public static final int NB_OF_INFO_TYPES = 3;


    public void setTrain(Train train) {
        this.train = train;
    }

    public void showNextInfo() {
        if (train == null) {
            System.out.println("No train assigned.");
            return;
        }

        System.out.println("Next Train Info: " + train.getTrainInfo(infoType));
        infoType = (infoType + 1) % 3;
    }
}
