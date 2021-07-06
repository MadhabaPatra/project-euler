//program 10- the sum of all the prime below 2 million
public class prog10
{
 public static void main(String[] args)
 {
     long n = 2000000, sum=2;
     boolean flag;
     for (long i = 3; i <= n; i += 2) {
          if (isprime(i))
               sum += i;
     }
     
     System.out.println(sum);
 }
 
 public static boolean isprime(long n){
        if(n % 2 == 0)
             return false;
                for(long i = 3; i <= Math.sqrt(n); i += 2) {
                        if(n % i == 0)
                             return false;
                         }
        return true;
}
}
