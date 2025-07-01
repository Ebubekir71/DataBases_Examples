package ticketing;

import java.time.LocalDateTime;

public class SingleTicket extends Ticket {


    public SingleTicket(Zone[] zones) {
        super(zones, null);
    }

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        return super.isValid(zone, time);
    }

    @Override
    public String toString() {
        return "SingleTicket{}";
    }
}
