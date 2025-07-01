package ticketing;

import java.time.LocalDateTime;

public interface Verifiable {
    boolean isValid(Zone zone, LocalDateTime time);
}
