
public class Number3 {

	public static void main(String[] args) {
       int i,j,k,n=5;
		
		  for(i=1;i<=5;i++)
		  {
			  for(j=4;j>=i;j--)
			  {
				  System.out.print(" "); 
			  }
		  for(k=1;k<=i;k++)
		  {
			  System.out.print(k+" ");
			  }
		  System.out.println(); 
		  }
		 
		
		  for(i=1;i<=5;i++)
		  {
			  for(j=1;j<=i;j++) 
			  {
				  System.out.print(" "); 
			  }
		  for(k=1;k<=5-i;k++)
		  {
			  System.out.print(k+" ");
		   } 
		  System.out.println();
		  }
		 
	}

}
