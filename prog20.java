import java.math.BigInteger;

public class prog20 {
    public static void main(String[] args) {

        int sum = 0;
        BigInteger fact = BigInteger.ONE;

        for(int i = 2; i <= 100; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        while(fact.signum() == 1) {
            BigInteger temp = fact.mod(BigInteger.valueOf(10));
            sum += temp.intValue();
            fact = fact.divide(BigInteger.valueOf(10));
        }

        System.out.println(sum);
    }
}
