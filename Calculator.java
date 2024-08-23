import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    private Container c;
    private JLabel l1,l2,result;
    private JTextField t1,t2,t3;
    private JButton sum,sub,prod,div;


    Myframe()
    {
        setTitle("SIMPLE CALCULATOR");
        setSize(300,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        l1 = new JLabel("first number : ");
        l1.setBounds(10,30,100,20);
        c.add(l1);
        l2 = new JLabel("second number : ");
        l2.setBounds(10,60,100,20);
        c.add(l2);

        t1 = new JTextField();
        t1.setBounds(120,30,100,20);
        c.add(t1);
        
        t2 = new JTextField();
        t2.setBounds(120,60,100,20);
        c.add(t2);
        
        sum = new JButton("add");
        sum.setBounds(50,100,80,20);
        c.add(sum);
        
        sub = new JButton("subtract");
        sub.setBounds(50,140,80,20);
        c.add(sub);

        prod = new JButton("product");
        prod.setBounds(150,100,80,20);
        c.add(prod);

        div = new JButton("division");
        div.setBounds(150,140,80,20);
        c.add(div);

        result = new JLabel("result : ");
        result.setBounds(100,180,100,20);
        c.add(result);

        
        sum.addActionListener(this);
        sub.addActionListener(this);
        prod.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }
        public void actionPerformed(ActionEvent e)
        {
            try{
          if(e.getSource()==sum)
          {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            result.setText("result :"+ c);
          }
          if(e.getSource()==sub)
          {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            result.setText("result :"+ c);
          }
          if(e.getSource()==prod)
          {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a * b;
            result.setText("result :"+ c);
          }
          if(e.getSource()==div)
          {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a / b;
            result.setText("result :"+ c);
          }
        }catch(NumberFormatException e1){
            result.setText("please enter only integer value:");
        }catch(ArithmeticException e2){
            result.setText("invalid operation");
        }

    }
}

class Calculator
{
    public static void main(String args [])
    {
        Myframe f = new Myframe();

    }
}