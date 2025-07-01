package cardDesk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTime extends ShuffleAlgorithm{


    @Override
    public List<Card> shuffle(List<Card> cards) {

        List<Card> shuffled = new ArrayList<>(cards);


        long seed = System.currentTimeMillis();


        Collections.shuffle(shuffled, new java.util.Random(seed));

        return shuffled;
    }
}
