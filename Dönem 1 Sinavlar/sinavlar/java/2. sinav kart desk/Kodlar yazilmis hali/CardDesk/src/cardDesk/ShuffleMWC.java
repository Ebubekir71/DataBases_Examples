package cardDesk;

import java.util.ArrayList;
import java.util.List;

public class ShuffleMWC extends ShuffleAlgorithm{
    private int number;
    private int auxilary;

    public ShuffleMWC(int number) {
        this.number = number;
        this.auxilary = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getAuxilary() {
        return auxilary;
    }

    @Override
    public List<Card> shuffle(List<Card> cards) {
        List<Card> shuffled = new ArrayList<>(cards);

        int size = shuffled.size();
        for (int i = 0; i < size; i++) {
            int j = (number * i + auxilary) % size;
            swap(shuffled, i, j);
        }

        return shuffled;
    }


}
