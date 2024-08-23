import javax.swing.*;
import java.awt.*;

class Myframe extends JFrame {

    JLabel l1;
    JRadioButton b1,b2,b3,b4;
    JTextArea t1;
    Myframe()
    {
        Container c = getContentPane();
        c.setLayout(null);

        l1 = new JLabel("what is the capital of india?");
        l1.setBounds()
    }
}
class quiz 
{
    public static void main(String args[])
    {
        Myframe f = new Myframe();
        f.setTitle("QUIZ QUESTION");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}