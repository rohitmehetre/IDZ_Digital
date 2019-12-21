
public class Number6 {

	public static void main(String[] args) {

		int i,j,n=5;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<4;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
