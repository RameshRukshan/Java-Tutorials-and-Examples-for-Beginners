class L2
{
	public static void main (String args[])
	{
		int number = 10;
		final int numberTwo = 40; 		// Constant variable
		System.out.println(number);
		System.out.println(numberTwo);

		int[] arry = new int[2];		// array
		arry[0] = 45;
		arry[1] = 2;
		System.out.println(arry[0]);
		System.out.println(arry[1]);

		//numberTwo = 60;					//cannot assign a value to final variable numberTwo
		//System.out.println(numberTwo);

		System.out.println(number * numberTwo);		//Operators
		System.out.println(arry[0] - arry[1]);
	}
}