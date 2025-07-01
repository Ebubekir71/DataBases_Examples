package ticketing;

import java.time.LocalDateTime;

public interface Stampable {
    void stamp(LocalDateTime time);
}
