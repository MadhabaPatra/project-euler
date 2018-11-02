//program 7- the  10001st prime number
public class prog7
{
 public static boolean isprime(int n)
 {
     int i,c=0;
     boolean flag=false;
     for(i=1;i<=n;i++)
     {
         if (n%i==0)
         {
             c++;
         }
     }
        if(c==2)
        flag=true;
        return flag;
 }
 public static void main(String[] args)
 {
     int c=0,i=1;
     while(i>0)
     {
         if(isprime(i))
         {
             c++;
             if(c==10001)
             {
                 System.out.println("The prime number at 10001 position="+i);
                 break;
                }
            }
            i++;
        }
    }
}
     
     
     
