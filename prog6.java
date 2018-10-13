// program 6
public class prog6
{
 public static void main(String args[])
 {
     int sum1=0,sum2=0,i,diff,a=1;
     for(i=1;i<=100;i++)
     {
         sum1=sum1+i*i;
         sum2=sum2+i;
        }
        a=Math.pow(sum2,2);
        diff=a-sum1;
        System.out.println("result ="+diff);
    }
}


