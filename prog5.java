//the smallest positive number that is evenly divisible by all the number from 1to20
public class prog5
{
 public static void main(String args[])
 {
     int n=1,c=0,i;
     while(c<20)
     {
         c=0;
         for(i=1;i<=20;i++)
         {
             if(n%i==0)
             {
                 c++;
                
             }
         }
          n++;
     }
       System.out.println("The smallest number that can be divisible from 1 to 20 ="+(n-1));
 }
}
            
               
               
            
     
    


            
           
            
    
