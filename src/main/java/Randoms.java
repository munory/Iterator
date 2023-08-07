import java.util.Iterator;

public class Randoms implements Iterable<Integer> {

    private RandomIterator randomIterator;

    public Randoms(int min, int max) {
        this.randomIterator = new RandomIterator(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return randomIterator;
    }

}