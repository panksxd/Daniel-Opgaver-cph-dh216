class Part
{
	String name;
	int start;
	int length;

	Part(String name, int start, int length)
	{
		this.name = name;
		this.start = start;
		this.length = length;
	}

	String check()
	{
		return name.substring(start,start+length);
	}
}