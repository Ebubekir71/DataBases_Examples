package cardDesk;

import java.util.List;

public abstract class ShuffleAlgorithm {
    public abstract List<Card> shuffle(List<Card> cards);

    protected void swap(List<Card> cards, int position1, int position2) {
        Card temp = cards.get(position1);
        cards.set(position1, cards.get(position2));
        cards.set(position2, temp);
    }
}
