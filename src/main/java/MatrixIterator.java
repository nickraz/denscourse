import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIterator implements Iterator<Integer> {
    private int [][] value;
    private int i, j;

    public MatrixIterator(int[][] matrix) {
        this.value = matrix;
    }

    @Override
    public boolean hasNext() {
        if(i < value.length && j < value[i].length){
            return true;
        }
        else if(i >= value.length){
            return false;
        }
        else {
            j = 0;
            i++;
            return hasNext();
        }
    }

    @Override
    public Integer next() {
        if(hasNext()) {
            return value[i][j++];
        }
        throw new NoSuchElementException();
    }
}
