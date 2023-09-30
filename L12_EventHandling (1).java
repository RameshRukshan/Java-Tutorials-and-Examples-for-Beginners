//Event is state change of an object

import javax.swing.*;
import java.awt.event.*;

class UI implements ActionListener, KeyListener     //inherit Listners using interfaces
{
    private JFrame frameM;
    private JButton btn_send;
    private JTextField txt_inp;

    public void createUI()
    {
        frameM = new JFrame();
        frameM.setSize(800,500);		
		frameM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frameM.setLayout(null);			
        frameM.setVisible(true);	
        
        txt_inp = new JTextField();
        txt_inp.setBounds(50, 30, 300, 30);

        btn_send = new JButton("SEND");
        btn_send.setBounds(100,80,150,50);

        frameM.add(btn_send);
        frameM.add(txt_inp);

        UI aListner = new UI();

        btn_send.addActionListener(aListner);       //create btn click Action listner
        txt_inp.addKeyListener(this);               //create  key type key Listner
    }

////must overide ActionEvent methods because it is abstract
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(frameM,"Clicked!");
    }

//must overide keyEvent methods because it is abstract
    public void keyTyped(KeyEvent e)
    {
        JOptionPane.showMessageDialog(null, "Key Typed!");  //if key typed this will happen
    }

    public void keyPressed(KeyEvent e)
    {
        //if key pressed this will happen
    }

    public void keyReleased(KeyEvent e)
    {
        //if key realesed this will happen
    }
}

class Main
{
    public static void main(String args[])
    {
            UI guiD = new UI();
            guiD.createUI();
    }
}