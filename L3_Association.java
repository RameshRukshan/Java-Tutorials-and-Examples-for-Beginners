class Vehicle
{
	private String model;

	Passenger psg;

	public Vehicle(String model)
	{
		this.model = model;
		psg = new Passenger("Ramesh");
	}
	public void showTripDetails()
	{
		System.out.println("vehicle model is " + model);
		System.out.println("Passenger name is "+psg.returnName());
	}											
}


class Passenger
{
	private String name;
	public Passenger(String name)
	{
		this.name = name;
	}
	public String returnName()
	{
		return name;
	}
}


class MainC
{
	public static void main(String args[])
	{
		Vehicle vh = new Vehicle("Toyota");
		vh.showTripDetails();
	}
}