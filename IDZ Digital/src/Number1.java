
public class Number1 
{

	public static void main(String[] args)
	{
        int i,j,n=5;
        for(i=1;i<=5;i++)
        {
        	for(j=4;j>=i;j--)
        	{
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++)
        	{
        		System.out.print(" "+k);
        	}
        	System.out.println();
        }
	}

}
