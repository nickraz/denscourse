import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArray<E> implements Iterable<E>{
    private Object[] array;
    private int capacity;
    private int carriage;
    private int cntOfChanges;

    public DynamicArray(int startCapacity) {
        capacity = startCapacity;
        array = new Object[capacity];
    }

    public DynamicArray() {
        capacity = 10;
        array = new Object[capacity];
    }

    public void add(E val){
        if(array.length == carriage) {
            Object[]array2 = new Object[array.length + capacity];
            System.arraycopy(array, 0, array2, 0, array.length);
            array = array2;
            cntOfChanges++;
        }
        array[carriage++] = val;
    }

    public E get(int index){
        return (E)array[index];
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            private int changes = cntOfChanges;
            private int iteratorCarriage;

            @Override
            public boolean hasNext() {
                if (changes == cntOfChanges) {
                    return iteratorCarriage < carriage;
                } else
                    throw new ConcurrentModificationException();
            }

            @Override
            public E next() {
                if (hasNext()) {
                    return (E)array[iteratorCarriage++];
                } else
                    throw new NoSuchElementException();
            }
        };
    }
}
