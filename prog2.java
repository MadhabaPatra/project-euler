//program 2- the sum of even number of fibonacci series and the seqence should not exceed 4000000
public class prog2
{
 public static void main(String args[])
 {
     int a=1,b=2,c=0;
      int s=2;
     while(c<=4000000)
     {
         c=a+b;
         a=b;
         b=c;
         if(c%2==0)
         {
             s=s+c;
            }
        }
        System.out.println("The sum of the series is "+s);
    }
}

         
 