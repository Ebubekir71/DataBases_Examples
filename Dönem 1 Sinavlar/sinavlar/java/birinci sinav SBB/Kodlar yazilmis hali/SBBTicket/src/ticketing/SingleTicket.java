package ticketing;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Level;

public class SingleTicket extends Ticket {


    public SingleTicket(Zone[] zones) {
        super(zones, LocalDateTime.now());
    }
    private static final Logger logger = Logger.getLogger(SingleTicket.class.getName());

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        boolean isZoneMatch = false;
        for (Zone z : zones) {
            if (z == zone) {
                isZoneMatch = true;
                break;
            }
        }

        int hash = this.hashCode();

        if (!isZoneMatch) {
            logger.log(Level.WARNING, "ticketing.SingleTicket " + hash + " does not contain zone: " + zone);
            return false;
        }

        LocalDateTime stamped = getTimestamp();

        if (time.isBefore(stamped) || time.isAfter(stamped.plusMinutes(30))) {
            logger.log(Level.WARNING, "ticketing.SingleTicket " + hash + " has expired. Verification time: " + time);
            return false;
        }

        logger.log(Level.INFO, "ticketing.SingleTicket " + hash + " is valid.");
        return true;
    }


    @Override
    public String toString() {
        return "Single ticketing.Ticket [\n" +
                "zones: " + Arrays.toString(zones) + "\n" +
                "timestamp: " + getTimestamp() + "\n" +
                "hashcode: " + this.hashCode() + "\n]";
    }
}
