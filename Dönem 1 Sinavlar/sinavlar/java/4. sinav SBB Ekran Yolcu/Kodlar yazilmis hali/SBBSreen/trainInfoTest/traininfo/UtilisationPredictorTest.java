package traininfo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilisationPredictorTest {

    @Test
    public void testSuccessfulPrediction() {
        UtilisationPredictor.addRecord(1, 0, 'L');
        assertEquals('L', UtilisationPredictor.predict(1, 0));
    }

    @Test
    public void testFailedPrediction() {
        assertEquals('?', UtilisationPredictor.predict(999, 5));
    }
}
