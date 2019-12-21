import java.util.Scanner;

public class Occuerence {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		System.out.println("enter all the elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number you want to wish to see the occuerence:");
		int x=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("number of occurence of element:"+count);
   }

}
