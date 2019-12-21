
public class Number5 {

	public static void main(String[] args) {

		int i,j,n=9;
		for ( i=1; i<=n; i++)
        {
            // Print space in increasing order
            for (j=1; j<i; j++) 
            { 
                System.out.print(" "); 
            } 
            // Print star in decreasing order 
            for (int k=1; k<=((n+1)-i); k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
		
		
        
	}

}
