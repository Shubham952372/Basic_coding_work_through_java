import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ItemListener{
    JRadioButton male ,female;
    JTextArea t1;
     Myframe()
     {
        Container c = getContentPane();
        c.setLayout(null);
        
        male = new JRadioButton("male");
        female = new JRadioButton("female");
        male.setBounds(70,100,70,30);
        female.setBounds(70,150,100,30);
        c.add(male);
        c.add(female);

        t1 = new JTextArea();
        t1.setBounds(250,100,100,100);
        c.add(t1);

      

        ButtonGroup g = new ButtonGroup();
        g.add(male);
        g.add(female);


        male.addItemListener(this);
        female.addItemListener(this);

       
     }

     public void itemStateChanged(ItemEvent e)
     {
        if(e.getSource()==male)
        {
          t1.setText("MALE IS CLICKED");
        } 
         if(e.getSource()==female)
        {
           t1.setText("FEMALE IS CLICKED"); 
        } 
     }
}
class ItemEvent2{
    public static void main(String args [])
    {
        Myframe f = new Myframe();
        f.setTitle("ITEM EVENT");
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}