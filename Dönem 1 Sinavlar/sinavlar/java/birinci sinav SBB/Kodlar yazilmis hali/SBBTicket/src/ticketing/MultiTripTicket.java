package ticketing;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MultiTripTicket extends Ticket implements Stampable{
    private SingleTicket[] usedTrips = new SingleTicket[6];

    public MultiTripTicket(Zone[] zones) {
        super(zones, null);
    }

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        SingleTicket last = getLastStampedTicket();
        if (last == null) {
            return false;
        }
        return last.isValid(zone, time);
    }

    @Override
    public void stamp(LocalDateTime time) {
        for (int i = 0; i < usedTrips.length; i++) {
            if (usedTrips[i] == null) {
                usedTrips[i] = new SingleTicket(zones);
                break;
            }
        }
    }

    public int getNbOfUnusedTrips(){
        int used = 0;
        for (SingleTicket st : usedTrips) {
            if (st != null) {
                used++;
            }
        }
        return usedTrips.length - used;
    }

    public SingleTicket getLastStampedTicket(){
        for (int i = usedTrips.length - 1; i >= 0; i--) {
            if (usedTrips[i] != null) {
                return usedTrips[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        int used = 0;
        for (SingleTicket st : usedTrips) {
            if (st != null) used++;
        }

        return "Validation result of Multitrip ticketing.Ticket [\n" +
                "zones: " + Arrays.toString(zones) + "\n" +
                "timestamp: " + getTimestamp() + "\n" +
                "hashcode: " + this.hashCode() + "\n" +
                "used trips: " + used + "\n" +
                "Last stamped trip hashcode: " + (getLastStampedTicket() != null ? getLastStampedTicket().hashCode() : "none") + "\n]";
    }
}
