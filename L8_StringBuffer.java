//String buffer is flexiable

class mC 
{
	public static void main(String args[])
	{
		StringBuffer myStr = new StringBuffer("AbCDeF");
		myStr.append("PQR");
		myStr.insert(3,"C");		//insert char to given index
		myStr.reverse();
		
		System.out.println(myStr);	
	}
}