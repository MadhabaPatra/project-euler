// program 6
public class prog6
{
 public static void main(String args[])
 {
     int n = 100, a, b, c;
     
     a = (n * (n + 1) * (2 * n + 1)) / 6;
     b = (n * (n + 1)) / 2;
     c = b * b;
  
     System.out.println("Difference = " + (c - a));
    }
}
