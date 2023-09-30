class MyOwnException extends Exception
{

}

class mCLZ
{
	public static void main(String args[])
	{
		int x = 10;
		if (x == 10)
		{
			MyOwnException exx = new MyOwnException();
			try{
				throw exx;
			}catch(MyOwnException e){
				System.out.println("Exc Handled");
			}
		}
	}
}