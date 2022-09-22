class Check
{
	String a;
	String reverse = "";


	Check(String a)
	{
		this.a = a;
	}

	String palindrome()
	{
		for(int i = a.length(); i > 0; i--)
		{
			reverse = reverse + a.substring(i-1,i);
		}	
		if(reverse.equalsIgnoreCase(a))
		{
			System.out.println(reverse);
			return a;
			
		}	
		System.out.println(reverse);
		return "nope";
	}
}