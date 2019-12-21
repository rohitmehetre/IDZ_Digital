
public class Number2 {

	public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=5;i++)
        {
        	for(j=1;j<i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=1;k<=5-i+1;k++)
        	{
        		System.out.print(k+" ");
        	}
        	System.out.println();
        }
	}

}
