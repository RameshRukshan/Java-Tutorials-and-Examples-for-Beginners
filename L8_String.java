//Keep ans stack is stored object in memeory
//java memory management****************


class mC 
{
	public static void main(String args[])
	{
		int x;
		char y;
		
		String myStr = new String("ABchdkJ");
		//String result = myStr.toLowerCase(); 		//convert to lowercase text
		String result = myStr.toUpperCase();		//converts to uppercase text

		x = myStr.indexOf("h");		//check index of string
		y = myStr.charAt(0);		//get char  using index

		System.out.println("First String"+result);

		if(myStr.equals("gjvdh"))		//check equality
		{
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
/*
		if(myStr.equals.contains("ABcHdkJ"))
		{
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
*/

		result = myStr.replace("A","B");		//replaceing current content to new one Current A to New B

		System.out.println("Second Sting "+result);
		System.out.println("Content of Obj Sting "+myStr);	//Content of object is not changing
		System.out.println(x);	
		System.out.println(y);	
	}
}