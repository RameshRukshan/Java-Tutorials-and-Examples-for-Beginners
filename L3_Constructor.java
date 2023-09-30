class Laptop
{
	private String brand;
	private static float price = 60000f;
	
	public Laptop(String brd)
	{
		brand = brd;
	}
	public static void changePrice(float newPrice)
	{
		price = newPrice;
	}
	public void showBrand()
	{
		System.out.println(brand);
	}
	public void showPrice()
	{
		System.out.println("Price is " + price);
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
		Laptop a = new Laptop("Dell");
		a.showPrice();
		a.changePrice(70000f);
		a.showBrand();
		a.showPrice();
		System.out.println("Returned value is " + a.returnBrand());

		Laptop b = new Laptop("Hp");
		b.showBrand();
		b.showPrice();
		System.out.println("Returned value is " + b.returnBrand());
	}
}