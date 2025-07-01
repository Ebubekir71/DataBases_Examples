package traininfo;

public class Train {
    private final int trainNb;
    private Vehicle[] vehicles;

    public Train(int trainNb) {
        this.trainNb = trainNb;
        this.vehicles = new Vehicle[0];
    }

    public int getTrainNb() {
        return trainNb;
    }

    public Train attach(Vehicle vehicle) {
        int len = vehicles.length;
        Vehicle[] newArray = new Vehicle[len + 1];
        System.arraycopy(vehicles, 0, newArray, 0, len);
        vehicle.setPosition(len);
        newArray[len] = vehicle;
        vehicles = newArray;
        return this;
    }

    public String getTrainInfo(int infoType) {
        StringBuilder sb = new StringBuilder();
        for (Vehicle v : vehicles) {
            sb.append(v.getVehicleInfo(trainNb, infoType));
        }
        return sb.toString();
    }
}
