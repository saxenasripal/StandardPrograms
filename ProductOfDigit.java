import java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int pro=1;
		while (n!=0)
		{
			int rem=n%10;
			pro*=rem;
			n=n/10;
		}
			System.out.println(pro);

	}
}