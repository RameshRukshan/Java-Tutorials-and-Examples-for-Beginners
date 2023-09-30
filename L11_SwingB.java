import javax.swing.*;

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

		JLabel lbl_name = new JLabel();		//create label
		lbl_name.setBounds(10,15,100,30);	//set xposition, y position, width, height
		lbl_name.setText("Name");		//set text in label
		
		JTextField txt_name = new JTextField(10);	//create text box
		txt_name.setBounds(50,15,150,30);		//set xposition, y position, width, height

		String country[]={"India","Aus","U.S.A","England","Newzealand"};	//combo box values

		JComboBox cmb_sal = new JComboBox(country);	//create combo box
		cmb_sal.setBounds(10,80,150,30);		//set xposition, y position, width, height
		
		JRadioButton rad_male = new JRadioButton("Male");	//create radio button one
		rad_male.setBounds(10,150,100,30);	//set xposition, y position, width, height
		JRadioButton rad_female = new JRadioButton("Female");		//create radio button two
		rad_female.setBounds(110,150,100,30);		//set xposition, y position, width, height

		ButtonGroup gender=new ButtonGroup();		//create group for radio button for avoid multi select
		gender.add(rad_female); 			//add female radio button to group
		gender.add(rad_male);				//add male button to group

		JButton btn_send = new JButton("SEND");		//create button
		btn_send.setBounds(100,300,150,50);	//set xposition, y position, width, height

		frame1.add(lbl_name);		//add label to frame
		frame1.add(txt_name);		//add textbox to frame
		frame1.add(cmb_sal);		//add combo box to frame
		frame1.add(rad_male);		//add radio button male to frame
		frame1.add(rad_female);		//add radio button female to frame
		frame1.add(btn_send);		//add button to frame

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