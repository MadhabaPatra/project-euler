//program 7- the  10001st prime number
public class prog7
{
 
 public static void main(String[] args)
 {
     int i=3,j,n=1;
 boolean flag;
 while(n!=10001)
 {
   flag=false;
     for(j=2;j<i;j++)
     {
         if (i%j==0)
         {
             flag=true;
         break;
         }
         }
     if (flag!=true)
     {
         n++;
     }
     i++;
 }
 System.out.println(i-1);

    }
}
     
     
     
