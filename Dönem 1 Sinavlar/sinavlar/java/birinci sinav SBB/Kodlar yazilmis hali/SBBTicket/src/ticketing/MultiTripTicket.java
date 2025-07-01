package ticketing;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MultiTripTicket extends Ticket implements Stampable{
    private SingleTicket[] usedTrips;

    public MultiTripTicket(Zone[] zones) {
        super(zones, null);
    }

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        return super.isValid(zone, time);
    }

    @Override
    public void stamp(LocalDateTime time) {

    }

    public int getNbOfUnusedTrips(){
        return 0;
    }

    public SingleTicket getLastStampedTicket(){
        return null;
    }

    @Override
    public String toString() {
        return "MultiTripTicket{" +
                "usedTrips=" + Arrays.toString(usedTrips) +
                ", zones=" + Arrays.toString(zones) +
                '}';
    }
}
