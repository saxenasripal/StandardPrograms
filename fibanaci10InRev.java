class fibanaci10InRev 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c=0;
		
		for (int i=1;i<=10 ;i++ )
		{
			c=a+c;
			a=b;
			b=c;
		}
		while (c>=0)
		{
			
			System.out.println(b);
			c=b-a;
			b=a;
			a=c;
		}
	}
}
