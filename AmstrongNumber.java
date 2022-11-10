import java.util.Scanner;
class AmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int a=n;
		int count=0;
		while (n!=0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		n=a;
		int sum=0;
		while (a!=0)
		{	
			int rem=a%10;
			int j=1;
			int pow=1;
			while (j<=count)
			{
				pow=pow*rem;
				j++;	
			}
			sum=sum+pow;
			a=a/10;
		}
		if (sum==n)
		{
			System.out.println("it is amstrong number");
		}
		else
		{
		System.out.println("it is not a amstrong number");
		}
	}	
}