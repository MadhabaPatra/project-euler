
public class prog12
{
    
	public static void main(String[] args) {
	    System.out.println("Hello World");
	     System.out.println();
		boolean flag=false;
		int i=0;
		int c=0;
			while(c<=30000)
		{
		    int rs=0;
		    i++;
		   c=c+i;
		   rs=CountMul(c);
		    System.out.print("  "+c);
		   if (rs>500)
		   {
		       break;
		   }
		   
		}
	    System.out.println("Hello World  "+CountMul(c));
	   
	}
	
	public static int CountMul(int n){
	    int count=0;
	    for (int i=1;i<=n ;i++ )
	    {
	        if (n%i==0)
	        {
	            count++;
	        }
	    }
	    return count;
	}
	
}
