// program 9
public class prog9
{
    public static void main(String args[])
    {
        int i,j,a,b;
        for(i=1;i<1000-1;i++)
        {
            for(j=i+1;j<1000;j++)
            {
                a=i;
                b=j;
                double csquare = a*a+b*b;
                double c = Math.pow(csquare, 0.5);
                if (a + b + c == 1000)
                {
                    System.out.println((int)(a * b * c));
                    break;
                }
            }
        }

    }
}

