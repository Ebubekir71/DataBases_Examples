package traininfo;

public abstract class Vehicle {
    private int position;

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public abstract String getVehicleInfo(int trainNb, int infoType);
}
