import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener
{
    Container c;
    JTextField t1;

    public Myframe()
    {
        c  = this.getContentPane();
        c.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(100,100,100,30);
        c.add(t1);

        t1.setFont(new Font ("Arial",Font.ITALIC,20));

        t1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
      String s = t1.getText();
      t1.setText(s.toUpperCase());
    }

}
class ActionEvent2
{
    public static void main(String args [])
    {
        Myframe f = new Myframe();
        f.setTitle("action event");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}