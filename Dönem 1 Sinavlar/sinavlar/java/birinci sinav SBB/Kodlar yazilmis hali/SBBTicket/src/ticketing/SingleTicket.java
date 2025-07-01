package ticketing;

import java.time.LocalDateTime;

public class SingleTicket extends Ticket {


    public SingleTicket(Zone[] zones) {
        super(zones, LocalDateTime.now());
    }

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        boolean zoneMatch = false;
        for (Zone z : zones) {
            if (z == zone) {
                zoneMatch = true;
                break;
            }
        }

        if (!zoneMatch) return false;

        LocalDateTime ticketTime = getTimestamp();
        return !time.isBefore(ticketTime) && time.isBefore(ticketTime.plusMinutes(30));


    }

    @Override
    public String toString() {
        return "SingleTicket{}";
    }
}
