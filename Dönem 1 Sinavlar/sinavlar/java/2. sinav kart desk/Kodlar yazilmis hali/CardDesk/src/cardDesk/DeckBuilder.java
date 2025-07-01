package cardDesk;

import java.util.ArrayList;
import java.util.List;

public class DeckBuilder {



    public CardDeck createCardDeck(int cardsPersuit){
        List<Card> cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()){
            for (int i = 1; i < cardsPersuit; i++){
                cards.add(new Card(suit, i));
            }
        }

        return new CardDeck(cards);
    }
}
