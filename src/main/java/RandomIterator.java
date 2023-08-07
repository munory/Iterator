import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

    private final int min;

    private final int max;

    private final Random random = new Random();

    public RandomIterator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min + 1) + min;
    }

}
