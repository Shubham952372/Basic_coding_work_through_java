import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swg9
{
    public static Container c;

    public static void main(String args[])
    {
     JFrame jf = new JFrame ("action demo..");
     jf.setBounds(100,100,1000,500);
     jf.setVisible(true);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    c = jf.getContentPane();
    c.setLayout(null);

    JButton red= new JButton("red");
    JButton yellow= new JButton("yellow");
    JButton green= new JButton("green");
    
    red.setBounds(100,100,100,50);
    yellow.setBounds(250,100,100,50);
    green.setBounds(400,100,100,50);

    c.add(red);
    c.add(yellow);
    c.add(green);

    red.addActionListener(new Redclass());
    yellow.addActionListener(new yellowclass());
    green.addActionListener(new greenclass());


    }
}
class Redclass implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
        swg9.c.setBackground(Color.RED);
    }
}
class yellowclass implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
        swg9.c.setBackground(Color.YELLOW);
    }
}
class greenclass implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
        swg9.c.setBackground(Color.GREEN);
    }
}