import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    JLabel l1,l2,result;
    JButton b1,b2,b3,b4;
    JTextField t1,t2;

    Myframe()
    {
        Container c = getContentPane();
        c.setLayout(null);
        setTitle("calculator");
        setBounds(100,100,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        l1 = new JLabel("first number:");
        l1.setBounds(30,50,150,30);
        c.add(l1);

        t1 = new JTextField();
        t1.setBounds(200,50,100,30);
        c.add(t1);

        l2 = new JLabel("second number:");
        l2.setBounds(30,100,150,30);
        c.add(l2);

        t2 = new JTextField();
        t2.setBounds(200,100,100,30);
        c.add(t2);

        b1 = new JButton("sum");
        b1.setBounds(30,300,70,30);
        c.add(b1);

        b2 = new JButton("sub");
        b2.setBounds(120,300,70,30);
        c.add(b2);

        b3 = new JButton("prod");
        b3.setBounds(210,300,70,30);
        c.add(b3);

        b4 = new JButton("div");
        b4.setBounds(300,300,70,30);
        c.add(b4);

        result = new JLabel("result");
        result.setBounds(100,400,100,30);
        c.add(result);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            result.setText("result:"+ c);
        }
         if(e.getSource()==b2)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            result.setText("result:"+ c);
        }
         if(e.getSource()==b3)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a * b;
            result.setText("result:"+ c);
        }
         if(e.getSource()==b4)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a / b;
            result.setText("result:"+ c);
        }
 
    }
}
    class Calculator1
    {
        public static void main(String args [])
        {
            Myframe f = new Myframe();
        }
    }

