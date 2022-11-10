import java.util.Scanner;
class MinMaxFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Min value");
		int min=sc.nextInt();
		System.out.println("Enter the Max value");
		int max=sc.nextInt();
		for (int i=min;i<=max ;i++ )
		{
			int fact=1;
			for (int j=1;j<=i;j++ )
			{
				fact=fact*j;
			}
			System.out.println("factorial of "+i+" is "+fact);
		}
	}
}
