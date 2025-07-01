package ticketing;

import java.time.LocalDateTime;
import java.util.Arrays;

public abstract class Ticket implements Verifiable {
    private LocalDateTime timestamp;
    protected Zone[] zones;

    public Ticket(Zone[] zones, LocalDateTime timestamp) {
        this.zones = zones;
        this.timestamp = timestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public abstract boolean isValid(Zone zone, LocalDateTime time);

    @Override
    public String toString() {
        return "Ticket{" +
                "timestamp=" + timestamp +
                ", zones=" + Arrays.toString(zones) +
                '}';
    }
}
