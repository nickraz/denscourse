import java.util.Iterator;
import java.util.NoSuchElementException;

public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            Iterator<Integer> carriage = it.next();

            {
                skipEmpty();
                System.out.println("Я ЭТО СДЕЛАЛ");
            }

            private void skipEmpty() {
                if (it.hasNext() && !carriage.hasNext()) {
                    carriage = it.next();
                    skipEmpty();
                }
            }

            @Override
            public boolean hasNext() {
                return it.hasNext() || carriage.hasNext();
            }

            @Override
            public Integer next() {
                skipEmpty();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return carriage.next();
            }
        };
    }
}
