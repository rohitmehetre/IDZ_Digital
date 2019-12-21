import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int temp=n;
		int s=0,s1;
		while(temp>0)
		{
			int i=temp%10;
		    s=s+i;
			temp=temp/10;
		}
		System.out.println(s);
		s1=s+s+s;
		System.out.println(s1);
		if(n==s1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}

	}

}
