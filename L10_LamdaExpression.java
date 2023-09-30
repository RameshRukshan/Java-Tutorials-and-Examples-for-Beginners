

interface Student
{
	abstract public void show();
}

interface Employee
{
	abstract public void display(String name);
}	
	

class mC 
{
	public static void main(String args[])
	{
		Student s=()->
		{
			System.out.println("I am a Student");
		};
		s.show();

		Employee e = (name)->
		{
			System.out.println("Name is "+name);
		};
		e.display("Ramesh");
	}
}