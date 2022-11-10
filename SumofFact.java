import java.util.Scanner;
class SumofFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int backOfN=num;
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			int fact=1;
			for (int i=rem;i>=1 ;i-- )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if (sum==backOfN)
		{
			System.out.println(backOfN+" is a strong Number");
		}
		else 
		{
			System.out.println(backOfN+" is not a strong Number");
		}
	}
}
