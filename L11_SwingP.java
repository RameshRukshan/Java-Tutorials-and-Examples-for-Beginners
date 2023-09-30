import javax.swing.*;
import java.awt.Color;

class GUI
{
	public void createUi()
	{
		JFrame frame1 =  new JFrame();		//create frame
		frame1.setSize(800,500);		//set width height
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//add close button operation
		frame1.setLayout(null);			//default template clear
		frame1.setVisible(true);		//frame visible on
		frame1.setTitle("Form Test");		// form name

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel1.setBounds(0,0,400,500);

		JPanel panel2 =  new JPanel();
		panel2.setBackground(Color.black);
		panel2.setBounds(400,0,400,200);

		JButton btn_test = new JButton("TEST");
		btn_test.setBounds(0,0,300,50);

		panel1.add(btn_test);

		frame1.add(panel1);
		frame1.add(panel2);
	}
}

class Main
{
	public static void main(String args[])
	{
		GUI gui = new GUI();
		gui.createUi();
	}
}