import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    Container c;
    JButton b1,b2,b3;

    Myframe ()
    {
        c=this.getContentPane();
        c.setLayout(null);

        b1=new JButton ("red");
        b2=new JButton ("green");
        b3=new JButton ("yellow");
        b1.setBounds(100,100,100,50);
        b2.setBounds(250,100,100,50);
        b3.setBounds(400,100,100,50);
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            c.setBackground(Color.RED);        }
             if(e.getSource()==b2)
        {
            c.setBackground(Color.GREEN);        }
             if(e.getSource()==b3)
        {
            c.setBackground(Color.YELLOW);        }
            
    }
}
class swg7
{
    public static void main(String args[]) 
    {
        Myframe f= new Myframe();
        f.setTitle("actiondemo2");
        f.setBounds(100,100,1000,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
 