class Main
{
	public static void main(String [] args)
	{

		int arg = Integer.parseInt(args[0]);
		MathWork div = new MathWork(arg);
		div.divisible();
		System.out.println(div.getRandom());
		div.sub(arg);

	}
}