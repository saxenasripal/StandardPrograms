import java.util.Scanner;
class EvenDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		while (n!=0)
		{
			int rem=n%10;
			if (n%2==0)
			{
				System.out.println(rem);
			}
			n=n/10;
		}
	}
}