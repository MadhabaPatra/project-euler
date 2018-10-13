//program 3- the largest prime factor of 600851475143

 public class prog3
{
  public static void main(String args[])
  {
     int i,max=0;
      long a=600851475143L;
      while(a>1)
      {
          for(i=2;i<=n;i++)
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

        
                    
                      
                     