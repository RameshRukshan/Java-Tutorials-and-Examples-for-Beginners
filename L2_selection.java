import java.util.Scanner;

class SelectionsM
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = 10;
		System.out.print("Enter a Name : ");
		String num = sc.nextLine();
		//number = Integer.parseInt(System.console().readLine());
		// "Integer.parseInt()" is converting input to int
		if (number > 10)
		{
			System.out.println("Number is larger than 10");
		}else{
			System.out.println("Number is less than 10");
		}

				// Switch case
		int Option;
		System.out.println("\n\nOptions |_________________");
		System.out.println("1 - Credit");
		System.out.println("2 - Debit");
		System.out.print("Enter Number according to your Selection : ");
		
		Option = Integer.parseInt(System.console().readLine());
		switch(Option)
		{
			case 1:
				System.out.println("Credit is Selected");
				break;
			case 2:
				System.out.println("Debit is Selected");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
}