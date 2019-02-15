import java.math.BigInteger;
import java.util.Iterator;

public class Fibo implements Iterable<BigInteger> {

    @Override
    public Iterator<BigInteger> iterator() {
        return new Iterator<BigInteger>() {
            private BigInteger st = BigInteger.ZERO;
            private BigInteger prev1;
            private BigInteger prev2;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public BigInteger next() {
                BigInteger retVal = null;
                if (st.compareTo(BigInteger.ZERO) == 0) {
                    prev1 = BigInteger.ONE;
                    retVal = prev1;
                } else if (st.compareTo(BigInteger.ONE) == 0) {
                    prev2 = BigInteger.ONE;
                    retVal = prev2;
                } else {
                    retVal = prev1.add(prev2);
                    prev1 = prev2;
                    prev2 = retVal;
                }
                st = st.add(BigInteger.ONE);
                return retVal;
            }
        };
    }

}
