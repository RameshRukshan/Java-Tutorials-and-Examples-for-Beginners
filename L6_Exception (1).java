// Exception is a object created by exception class
// Exception is unexpected error. It crashed a program and Statements after the exception not working
// Exceptions can be handled -> avoid failure
class Test
{
	public void Show() throws NumberFormatException
	{
		String d = "RAR";
		int val = Integer.parseInt(d);
	}
}

class mCLS
{
	public static void main(String args[])
	{
		int x;
		System.out.println("Statement 01");
		System.out.println("Statement 02");
		try{
			x = 50/0;
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage());
		}
		finally		//if it is no exception this will work
		{
			System.out.println("can use indicate end.");
		}
		System.out.println("Statement 03");
		System.out.println("Statement 04");
//--------------------------------------------------------------
		int[] data = new int[3];
		try{
			data[0] = 50;
			data[1] = 65;
			data[2] = 0;
			data[3] = 15;

			int ans = data[1]/data[2];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Out of Index Exception");
		}catch(ArithmeticException e){
			System.out.println("Can't devide by Zero");
		}
//--------------------------------------------------------------
		int value;
		String ta = "nibm";
		try{
			value = Integer.parseInt(ta);
		}catch(NumberFormatException e){
			System.out.println("Number Format Exception");
		}
//----------------------------------------------------------------
		Test t = new Test();
		try{
			t.Show();
		}catch(NumberFormatException e){
			System.out.println("Number Format Exception2");
		}
//--------------------------------------------------------------
	}
}