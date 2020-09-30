import java.math.BigInteger;

public class prog16 {
    public static void main(String[] args) {

        BigInteger num = new BigInteger(String.valueOf(2));
        BigInteger p = num.pow(1000);
        String result = String.valueOf(p);

        int n = result.length(), sum, temp;
        sum = temp = 0;

        for(int i = 0; i < n; i++) {
            temp = result.charAt(i) - 48;
            sum += temp;
        }
        System.out.println(sum);
    }
}
