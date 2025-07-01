package traininfo;

public class Coach extends Vehicle {
    private int travelClass;
    private Feature feature;

    public Coach(int travelClass, Feature feature) {
        this.travelClass = travelClass;
        this.feature = feature;
    }

    public Coach(int travelClass) {
        this(travelClass, Feature.NONE);
    }

    @Override
    public String getVehicleInfo(int trainNb, int infoType) {
        switch (infoType) {
            case 0:
                return "| " + travelClass + " |";
            case 1:
                char load = UtilisationPredictor.predict(trainNb, getPosition());
                return switch (load) {
                    case 'L' -> "| i |";
                    case 'M' -> "| ii |";
                    case 'H' -> "| iii |";
                    default -> "|---|";
                };
            case 2:
                return switch (feature) {
                    case NONE -> "| " + travelClass + " |";
                    case BIKE -> "|ovò|";
                    case DISABLED -> "|io |";
                    case FAMILIY -> "|°o°|";
                };
            default:
                return "| ? |";
        }
    }
}
