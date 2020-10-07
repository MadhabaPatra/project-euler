//program 3- the largest prime factor of 600851475143

 public class prog3
{
  public static void main(String args[])
  {
     int i,max=0;
      long a=600851475143L;
      for( i=1,i<=a;i++)
      {
          for(i=2;i<=a;i++)
          {
              if(a%i==0)
              {
                  if(max<i)
                  {
                      max=i;
                  }
                  break;
              }
          }
          a=a/i;
      }
        System.out.println("The largest prime factor="+max);
    }
}

        
                    
                      
                     
