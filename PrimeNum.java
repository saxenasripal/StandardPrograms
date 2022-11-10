import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<n ;i++ )
			{
				if(n%i==0)
				{
					count++;
				}
				if (count==2)
				{
					break;
				}
			}
		if (count==1)
		{
			System.out.println("it is a prime number");
			
		}
		else
		{
			System.out.println("this is not a prime number");
		}
	}
}
