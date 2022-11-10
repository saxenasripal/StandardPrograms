import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0,pro=1;
		while (n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
		}
		if (sum==pro)
		{
			System.out.println("this is a spy number");
		}
	}
}
