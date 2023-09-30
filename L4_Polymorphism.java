class Animal
{
	public void show()
	{
		System.out.println("It is an Animal");
	}
}

class Dog extends Animal
{
	public void show()
	{
		System.out.println("It is a Dog");
	}
}

class MainExClass
{
	public static void main(String args[])
	{
		Dog a = new Dog();
		a.show();
	}
}

// Example for method overloading