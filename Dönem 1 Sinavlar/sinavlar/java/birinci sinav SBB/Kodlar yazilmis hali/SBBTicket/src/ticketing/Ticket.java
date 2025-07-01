package ticketing;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Ticket implements Verifiable {
    private LocalDateTime timestamp;
    protected Zone[] zones;

    public Ticket(Zone[] zones, LocalDateTime timestamp) {
        this.zones = zones;
        this.timestamp = timestamp;
    }

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        return false;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "timestamp=" + timestamp +
                ", zones=" + Arrays.toString(zones) +
                '}';
    }
}
