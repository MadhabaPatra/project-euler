//program 10- the sum of all the prime below 2 million
public class prog10
{
 
 public static void main(String[] args)
 {
int i=3,j,sum=2;
 
 boolean flag;
 while(i<2000000)
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
        
         sum=sum+i;
     }
     i++;
 }
 System.out.println(sum);
    
}
}
             
