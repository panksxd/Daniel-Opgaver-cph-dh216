class Main
{
	public static void main(String [] args)
	{
	int arg = Integer.parseInt(args[0]);
	int arg1 = Integer.parseInt(args[1]);		
	Fib f1 = new Fib(arg, arg1);
	f1.fibonacci();
	}
}
