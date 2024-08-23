import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener  {//interface

    Container c;
    JButton b1;


//constructor
    Myframe()
    {
        c = this.getContentPane();
        c.setLayout(null);

        b1 = new JButton("click on");
        b1.setSize(100,50);
        b1.setLocation(100,100);
        c.add(b1);
        
        b1.addActionListener(this);



    }
    public void actionPerformed(ActionEvent e)
    {
      c.setBackground(Color.GREEN);
    }

}
class swg6{
    public static void main(String args[])
    {
     Myframe f = new Myframe();
     f.setTitle("action demo.");
     f.setBounds(100,100,1000,500);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

    
