import java.util.Scanner;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while (n>9)
		{		
			int square=1;
			sum=0;
			while (n>0)
			{
				int rem=n%10;
				square=rem*rem;
				sum=sum+square;
				n=n/10;
			}
			n=sum;
			if (sum==1)
			{
				System.out.println("it is a happy number");
			}
		}
		if (sum!=1)
		{
			System.out.println("it is not a happy Number");
		}
	}
}
