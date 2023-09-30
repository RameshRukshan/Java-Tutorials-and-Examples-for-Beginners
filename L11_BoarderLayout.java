import javax.swing.*;
import java.awt.*;

class GUI
{
	public void createUi()
	{
		BorderLayout bLayout = new BorderLayout();
	
		JFrame frame1 =  new JFrame();		//create frame
		frame1.setSize(800,500);		//set width height
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//add close button operation
		frame1.setLayout(bLayout);			
		frame1.setVisible(true);		//frame visible on
		frame1.setTitle("Form Test");		// form name

		JButton btn_1 = new JButton();
		btn_1.setSize(200,50);
		JButton btn_2 = new JButton();
		JButton btn_3 = new JButton();
		JButton btn_4 = new JButton();
		JButton btn_5 = new JButton();

		frame1.add(btn_1, BorderLayout.SOUTH);
		frame1.add(btn_2, BorderLayout.NORTH);
		frame1.add(btn_3, BorderLayout.WEST);
		frame1.add(btn_4, BorderLayout.CENTER);
		frame1.add(btn_5, BorderLayout.EAST);

//grid layout
//flow layout
//border layout
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