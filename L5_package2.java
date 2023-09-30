import nibm.Student;	//Package inside nibm folder Student.java file
import nibm.Module;
//insted of those two import we can use "import nibm.*;"
import static nibm.Student.getData;	//can dirrectly call function by name

class mainCS
{
	public static void main(String args[])
	{
		Student x = new Student();
		x.view();
		x.show();
		Module y = new Module();
		y.show();
		getData();		//can dirrectly call function by name
	}
}
