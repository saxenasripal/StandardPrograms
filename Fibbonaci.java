class Fibbonaci 
{
	public static void main(String[] args) 
	{
		int a=0,b=1;
		int c=0;
		for (int i=1;i<=10;i++)
		{
			c=a+c;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
