import javax.swing.*;
import java.awt.event.*;

class UiD implements MouseListener
{
    private JFrame formFrame;
    private JButton btn_name;

    public void createGUI()
    {
        formFrame = new JFrame();
        formFrame.setSize(400,400);
        formFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formFrame.setLayout(null);
        formFrame.setVisible(true);

        btn_name = new JButton("NAME");
        btn_name.setBounds(40,40,250,30);

        formFrame.add(btn_name);

        btn_name.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){
        JOptionPane.showMessageDialog(formFrame, "Mouse Pointer Entered into feild!");
    }
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}

class MainC
{
    public static void main(String args[]){
        UiD ui = new UiD();
        ui.createGUI();
    }
}