import java.math.BigInteger;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        Iterator<BigInteger> iterator = fibo.iterator();
        for (int i = 0; i < 100; i++) {
            System.out.println(iterator.next());
        }
    }

}
