import java.util.Scanner;

public class alphabetical {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("enter all the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
		}
		for(int i=0;i<a[i].length();i++)
		{
			for(int j=i+1;j<a[i].length();j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(a[i]+ ",");
		}
		

	}

}
