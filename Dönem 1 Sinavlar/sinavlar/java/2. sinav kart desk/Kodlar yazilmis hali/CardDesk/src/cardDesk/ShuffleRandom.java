package cardDesk;

import java.util.Collections;
import java.util.List;

public class ShuffleRandom extends ShuffleAlgorithm{
    @Override
    public List<Card> shuffle(List<Card> cards) {

        List<Card> copy = List.copyOf(cards);
        List<Card> shuffled = new java.util.ArrayList<>(copy);


        Collections.shuffle(shuffled);

        return shuffled;
    }
}
