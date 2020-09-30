public class prog14 {
    public static void main(String[] args) {

        final int highest = 1000000;
        int size = 0, max = 1, temp = 0;

        for(int i = 2; i < highest; i++) {
            long num = i;
            int n = 0;
            while(num != 1) {
                n++;
                if(num % 2 == 0) {
                    num /= 2;
                }
                else {
                    num = 3 * num + 1;
                }
            }
            if(n > max) {
                max = n;
                temp = i;
            }
            n = 0;
        }
        System.out.println(temp);
    }
}
