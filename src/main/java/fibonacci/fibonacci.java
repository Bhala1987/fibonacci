package fibonacci;

import java.math.BigDecimal;

public class fibonacci {
    public fibonacci(int val) {
        BigDecimal n = BigDecimal.valueOf(val), firstTerm = BigDecimal.valueOf(0), secondTerm = BigDecimal.valueOf(1);
        System.out.println("Fibonacci series till " + val + " values:");
        for (BigDecimal i = BigDecimal.valueOf(0); i.compareTo(n) < 0; ) {
            System.out.print(firstTerm + "  ");
            // compute the nextterm
            BigDecimal nextTerm = firstTerm.add(secondTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i = i.add(BigDecimal.ONE);
        }
    }
}
