package cardDesk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CardDeskTest {

    private CardDeck deck;
    private DeckBuilder builder;

    @BeforeEach
    public void setup() {
        builder = new DeckBuilder();
        deck = builder.createCardDeck(13); // her suit için 13 kart
    }

    @Test
    public void testCardDeckSize() {
        assertEquals(52, deck.getCards().size(), "Destede 52 kart olmalı");
    }

    @Test
    public void testShuffleRandomChangesOrder() {
        List<Card> before = List.copyOf(deck.getCards());

        deck.shuffle(new ShuffleRandom());
        List<Card> after = deck.getCards();

        // Karıştırma sonucu en az 1 kart farklı yerde olmalı
        boolean isDifferent = false;
        for (int i = 0; i < before.size(); i++) {
            if (!before.get(i).equals(after.get(i))) {
                isDifferent = true;
                break;
            }
        }

        assertTrue(isDifferent, "ShuffleRandom karıştırmalı ama sıra aynı kalmış");
    }

    @Test
    public void testShuffleGradeGreaterThanZero() {
        deck.shuffle(new ShuffleMWC(3)); // örnek sabit sayı
        int grade = deck.shuffleGrade();

        assertTrue(grade > 0, "Karıştırma sonrası shuffleGrade sıfırdan büyük olmalı");
    }

    @Test
    public void testShuffleWithTimeProducesDifferentDecks() throws InterruptedException {
        List<Card> first = builder.createCardDeck(13).getCards();

        Thread.sleep(5); // farklı timestamp için

        CardDeck secondDeck = builder.createCardDeck(13);
        secondDeck.shuffle(new ShuffleTime());

        assertNotEquals(first, secondDeck.getCards(), "ShuffleTime farklı desteler üretmeli");
    }
}

