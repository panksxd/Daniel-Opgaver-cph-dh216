class Fib
{
	int a;
	int b;
	int c;
	Fib(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void fibonacci()
	{
		while(a < 1000)
		{
			c = a + b;
			b = a;
			a = c;
			if(a < 1000)
			{
				System.out.println(a);
			}
		}
	}
}