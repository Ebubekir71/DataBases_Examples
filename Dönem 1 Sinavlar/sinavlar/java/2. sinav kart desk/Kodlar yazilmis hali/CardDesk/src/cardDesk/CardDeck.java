package cardDesk;

import java.util.List;

public class CardDeck {
    private List<Card> cards;

    public CardDeck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle(ShuffleAlgorithm algorithm) {
        this.cards = algorithm.shuffle(cards);
    }

    public int shuffleGrade(){
        int grade = 0;
        int cardsPerSuit = cards.size() / Suit.values().length;

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);


            int expectedPosition = card.getSuit().ordinal() * cardsPerSuit + (card.getValue() - 1);
            grade += Math.abs(i - expectedPosition);
        }

        return grade;
    }
    @Override
    public String toString() {
        return cards.toString();
    }

}
