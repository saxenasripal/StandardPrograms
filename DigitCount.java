import java.util.Scanner;
class DigitCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=0;
		while (n!=0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}