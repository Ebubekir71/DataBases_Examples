package ticketing;

import java.time.LocalDateTime;

public class DayCard implements Verifiable, Stampable {
    private LocalDateTime expiry;

    @Override
    public void stamp(LocalDateTime time) {
        this.expiry = time.toLocalDate().atTime(23, 59);
    }

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        return expiry != null && !time.isAfter(expiry);
    }

    @Override
    public String toString() {
        return "ticketing.DayCard{" +
                "expiry=" + expiry +
                '}';
    }
}
