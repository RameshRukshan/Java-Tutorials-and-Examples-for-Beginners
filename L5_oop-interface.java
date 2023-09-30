class Product
{
	public void display()
	{
		System.out.println("This is a product");
	}
}

interface test
{
	public void testImp();	
}

interface Keyboard extends test
//interface can inherit another interface
{
	final public static float price = 500.00f; 	//value can't be change, by default is final

	abstract public void type();	//interface default is abstract
	default public void press()	// default is use to implement unique task in interface
	{
		System.out.println("Pressing...");
	}
	public static void release()	// not overide, call by class Name
	{
		System.out.println("Releasing...");
	}
}

class Device extends Product implements Keyboard
//can use only one sub class and can implement many interfaces
{
	public void type()
	{
		System.out.println("Typing...");
	}
	public void press()
	{
		System.out.println("Not Pressing...");
	}
	public void showPrice()
	{
		System.out.println(price);
	}
	public void testImp()
	{
		System.out.println("This is a test class Implement");
	}
}

class MC
{
	public static void main(String args[])
	{
		Device x =  new Device();
		x.type();
		x.press();
		Keyboard.release();
		x.showPrice();
		x.display();
		x.testImp();
	}
}