package ticketing;

import java.time.LocalDateTime;

public class DayCard implements Verifiable, Stampable{
    private LocalDateTime expiry;

    @Override
    public void stamp(LocalDateTime time) {

    }

    @Override
    public boolean isValid(Zone zone, LocalDateTime time) {
        return false;
    }

    @Override
    public String toString() {
        return "DayCard{" +
                "expiry=" + expiry +
                '}';
    }
}
