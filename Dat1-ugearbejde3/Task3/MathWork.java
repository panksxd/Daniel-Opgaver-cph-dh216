import java.util.Random;
class MathWork
{
	int[] arr = new int[] {1,1,1,2,2,3,3,3,4,5,5,5,6,6,7,8,8,9,9,10};
	int a;
	MathWork(int a)
	{
		this.a = a;
	}


	void divisible()
	{
		for(int i = 1; i < 101; i++)
		{
			if(a%i == 0)
			{
				System.out.println(i);
			}
		}
	}
	int getRandom()
	{
		Random r1 = new Random();
		return arr[0 + r1.nextInt(arr.length)];
	}
	void sub(int a)
	{
		for(int i = a; i > 0; i--)
		{
			System.out.println(i);
		}
	}
}