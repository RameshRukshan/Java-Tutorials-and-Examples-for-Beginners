class Student
{
	protected String name;
	public void setName(String name)
	{
		this.name = name;
	}	
}

class ALStudent extends Student		// inherited with "extends" keyword
{
	protected String admissionNumber;
	public void setAddmissionNumber(String adNumber)
	{
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
		ALStudent x = new ALStudent();
		x.setName("RAMESH");
		x.setAddmissionNumber("AD0012548");
		x.showDetails();
	}
}