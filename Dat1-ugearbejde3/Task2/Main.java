class Main
{
	public static void main(String[]args)
	{
		int argstart = Integer.parseInt(args[1]);
		int arglength = Integer.parseInt(args[2]);
		Part a = new Part(args[0], argstart, arglength);
		System.out.println(a.check());
	}
}