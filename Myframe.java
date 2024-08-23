package pack;
 
 import javax.swing.*;
 import java.awt.*;

  public class Myframe extends JFrame{

        JButton b1,b2,b3,b4,b5;
        public Myframe()
        {

        Container c = getContentPane();
        c.setLayout(null);

         b1 = new JButton("button1");
         b2 = new JButton("button2");
         b3 = new JButton("button3");
         b4 = new JButton("button4");
         b5 = new JButton("button5");
    
        b1.setBounds(20,20,80,30);
        b2.setBounds(120,20,80,30);
        b3.setBounds(220,20,80,30);
        b4.setBounds(20,100,80,30);
        b5.setBounds(120,20,80,30);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
    }
 }