class Student
{
	protected String name;
	public Student(String name)
	{
		this.name = name;
	}	
}

class ALStudent extends Student		// inherited with "extends" keyword
{
	protected String admissionNumber;
	public ALStudent(String name,String adNumber)
	{
		super(name);      // calles Super class Constructor
		admissionNumber = adNumber;
	}
	public void showDetails()
	{
		System.out.println(name + "\t" + admissionNumber);
	}
}

class subSuperClass
{
	public static void main(String args[])
	{
		ALStudent x = new ALStudent("Ramesh", "AD000523");
		x.showDetails();
	}
}