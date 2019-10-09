//the smallest positive number that is evenly divisible by all the number from 1to20
public class prog5
{
 public static void main(String args[])
 {
     long n=1;
     long i;
     for (i = 11; i <= 20; i++) {
          n = lcm(n,i);
     }
     System.out.println("The smallest number that can be divisible from 1 to 20 = " + n);
 }
 
 public static long lcm (long x, long y) {
      return ((x * y) / hcf (x , y));
              }
              
 public static long hcf (long x, long y) {
      while (x != y) {
           if (x > y)
                x -= y;
           else
                y -= x;
      }
      return x;
  }
}
