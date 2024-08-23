 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{

    Container c;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField pass;
    JButton b1;

    Myframe()
    {
        setTitle("loginform");
        setBounds(100,100,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);

        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l1.setBounds(10,50,100,20);
        l2.setBounds(10,100,100,20);

        c.add(l1);
        c.add(l2);

        t1 = new JTextField();
        t1.setBounds(120,50,100,20);
        c.add(t1);

        pass = new JPasswordField();
        pass.setBounds(120,100,100,20);
        c.add(pass);

        b1 = new JButton("login");
        b1.setBounds(100,150,70,30);

        c.add(b1);

        b1.addActionListener(this);
         setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
       System.out.println("Username:"+t1.getText());
       System.out.println("Password:"+pass.getText());

    }
}

 class swg10
 {
    public static void main(String args[])
    {
        Myframe f = new Myframe();
    } 
 }