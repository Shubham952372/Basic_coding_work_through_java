import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class calender implements ActionListener
{
    JFrame j;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b;
    calender()
    {
        j = new JFrame("CALENDER");
        l1 = new JLabel("DAY");
        l1.setBounds(50, 50, 100, 20);
        l2 = new JLabel("MONTH");
        l2.setBounds(50, 50, 100, 20);
        l3 = new JLabel("YEAR");
        l3.setBounds(50, 50, 100, 20);
        l4 = new JLabel("DAY");
        l4.setBounds(50, 50, 100, 20);
        l5 = new JLabel("MONTH");
        l5.setBounds(50, 50, 100, 20);
        l6 = new JLabel("YEAR");
        l6.setBounds(50, 50, 100, 20);
        l7 = new JLabel("DAY");
        l7.setBounds(50, 50, 100, 20);
        l8 = new JLabel("MONTH");
        l8.setBounds(50, 50, 100, 20);
        l9 = new JLabel("YEAR");
        l9.setBounds(50, 50, 100, 20);
        t1 = new JTextField(5);
        t1.setBounds(50,50,250,30);
        t2 = new JTextField(5);
        t2.setBounds(50,50,250,30);
        t3 = new JTextField(5);
        t3.setBounds(50,50,150,30);
        t4 = new JTextField(5);
        t4.setBounds(50,50,150,30);
        t5 = new JTextField(5);
        t5.setBounds(50,50,150,30);
        t6 = new JTextField(5);
        t6.setBounds(50,50,150,30);
        t7 = new JTextField(5);
        t7.setBounds(50,50,150,30);
        t8 = new JTextField(5);
        t8.setBounds(50,50,150,30);
        t9 = new JTextField(5);
        t9.setBounds(50,50,150,30);
        b = new JButton("CLICK");
        b.setBounds(50, 50, 95, 20);
        j.add(l1);
        j.add(t1);
        j.add(l2);
        j.add(t2);
        j.add(l3);
        j.add(t3);
        j.add(l4);
        j.add(t4);
        j.add(l5);
        j.add(t5);
        j.add(l6);
        j.add(t6);
        j.add(b);
        b.addActionListener(this);
        j.add(l7);
        j.add(t7);
        j.add(l8);
        j.add(t8);
        j.add(l9);
        j.add(t9);
        j.setSize(520,125);
        j.setLocation(200, 200);
        j.setLayout(new FlowLayout());
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n1,n2,n3,n4,n5,n6,day,month,year;
        n1 = Integer.parseInt(t1.getText());
        n2 = Integer.parseInt(t2.getText());
        n3 = Integer.parseInt(t3.getText());
        n4 = Integer.parseInt(t4.getText());
        n5 = Integer.parseInt(t5.getText());
        n6 = Integer.parseInt(t6.getText());
        if(n4>n1)
        {
            day=n4-n1;
        }
        else
        {
            day=(n4+30)-n1;
            n5=n5-1;
        }
        if (n5>n2)
        {
            month=n5-n2;
        }
        else
        {
            month = (n5+12)-n2;
            n6=n6-1;
        }
        year = n6-n3;
        t7.setText(day + " ");
        t8.setText(month + " ");
        t9.setText(year + " ");
    }
}
class module2t2{
    public static void main(String args [])
    {
        calender c = new calender();
    }
}