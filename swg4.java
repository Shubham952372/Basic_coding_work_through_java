import javax.swing.*;
import java.awt.*;

class swg4{
    public static void main(String args [])
    {
        JLabel l1,l2;
        JFrame jf = new JFrame();

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,800,400);
        Container c=jf.getContentPane();
        c.setLayout(null);

        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l1.setBounds(20,20,100,30);
        l2.setBounds(20,40,100,30);
        c.add(l1);
        c.add(l2);
        JTextField t1 = new JTextField();
        t1.setBounds(150,20,100,30);
        c.add(t1);

        JPasswordField  pass =new JPasswordField();
        pass.setBounds(150,45,100,30);
        c.add(pass);

        pass.setEchoChar('*');
        //pass.setEchoChar((char)0);





        jf.setVisible(true);
    }
}