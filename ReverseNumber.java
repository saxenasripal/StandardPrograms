import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		while (a!=0)
		{
			int rem=a%10;
			System.out.print(rem);
			a=a/10;
		}
	}
}
