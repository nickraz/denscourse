import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterratorJaggedArray implements Iterator<Integer> {
    int[][] array;
    int carriage = 0;
    int countElements = 0;

    public IterratorJaggedArray(int[][] array) {
        this.array = array;
        counts();
    }

    private void counts() {
        for (int[] mas : this.array) {
            countElements += mas.length;
        }
    }

    private Integer getElemnt() {
        Integer rst = null;
        int count = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                if (count == carriage) {
                    return this.array[i][j];
                } else {
                    count++;
                }
            }
        }
        return rst;
    }

    @Override
    public boolean hasNext() {
        return carriage < this.countElements;
    }

    @Override
    public Integer next() throws NoSuchElementException {
        if (this.getElemnt() != null) {
            Integer rst = this.getElemnt();
            carriage++;
            return rst;
        } else {
            throw new NoSuchElementException();
        }
    }
}