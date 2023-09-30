import javax.swing.*;
import java.awt.event.*;

class UiD implements ActionListener
{
    private JTextField txt_number;
    private JTextField txt_answer;
    private JTextArea lbl_number;
    private JTextArea lbl_answer;
    private JButton btn_x2;
    private JButton btn_x5;

    public void createUI()
    {
        JFrame fr = new JFrame();
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.setVisible(true);

        lbl_number = new JTextArea("Number");
        lbl_number.setBounds(20, 10, 50, 30);

        lbl_answer = new JTextArea("Answer");
        lbl_answer.setBounds(20, 60, 50, 30);

        txt_number = new JTextField();
        txt_number.setBounds(100, 10, 250, 30);

        txt_answer = new JTextField();
        txt_answer.setBounds(100, 60, 250, 30);

        btn_x2 = new JButton("X2");
        btn_x2.setBounds(20, 120, 100, 30);

        btn_x5 = new JButton("X5");
        btn_x5.setBounds(150, 120, 100, 30);

        fr.add(lbl_answer); fr.add(lbl_number); fr.add(txt_number); fr.add(txt_answer);
        fr.add(btn_x2); fr.add(btn_x5);

        btn_x2.addActionListener(this);
        btn_x5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int number, answer; answer = 0;

        number = Integer.parseInt(txt_number.getText());
        if (e.getSource()==btn_x2){
            answer = number * 2;
        }else if (e.getSource()==btn_x5){
            answer = number * 5;
        }

        txt_answer.setText(String.valueOf(answer));
    }

}

class Main
{
    public static void main(String args[])
    {
        UiD ui = new UiD();
        ui.createUI();
    }
}