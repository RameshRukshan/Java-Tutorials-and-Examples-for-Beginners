class RepeatM
{
	public static void main(String args[])
	{
		int c = 1;
		while(c <= 10)
		{
			System.out.println("Blah Blah");
			c = c + 1;
		}
		
	//----------------------------------------------------------------

		for(int co=6; co>=1; co--)
		{
			for(int ci=6; ci>=co; ci--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

//---------------------------------------------------------------
		System.out.print("\n\n");

		for(int co=6; co>=1; co--)
		{
			for(int ci=0; ci<co; ci++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}