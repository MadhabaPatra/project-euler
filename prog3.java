//program 3- the largest prime factor of 600851475143

 public class prog3
{
  public static void main(String args[])
  {
     int i;
     long a=600851475143L;
     
     for (i = 2; i <= Math.sqrt(a); i++)
     {
          while (a % i == 0) {
               a /= i;
          }
     }
   
     System.out.println("The largest prime factor="+a);
  }
 }
