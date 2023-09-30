class Laptop
{
	private String brand;
	
	public void setBrand(String brd)
	{
		brand = brd;
	}
	public void showBrand()
	{
		System.out.println(brand);
	}
	public String returnBrand()
	{
		return brand;
	}
}

class MainClass
{
	public static void main(String args[])
	{
		Laptop a = new Laptop();
		a.setBrand("Dell");
		a.showBrand();
		System.out.println("Returned value is " + a.returnBrand());
	}
}