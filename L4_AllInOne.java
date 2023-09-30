class Product
{
	protected float unitPrice;
	public Product(float unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	public void findAmount()
	{
		System.out.println("Total Amount is : " + unitPrice);
	}
}

class OnlineProduct extends Product
{
	private float deliverCharge;
	private float totalAmount;
	public OnlineProduct(float unitPrice, float deliverCharge)
	{
		super(unitPrice);
		this.deliverCharge = deliverCharge;
	}
	public void findAmount()
	{
		totalAmount = unitPrice + deliverCharge;
		System.out.println("Total Amount is : " + totalAmount);
	}
}

class MainC
{
	public static void main(String args[])
	{
		OnlineProduct x = new OnlineProduct(100.75f, 500.00f);
		x.findAmount();	
	}
}