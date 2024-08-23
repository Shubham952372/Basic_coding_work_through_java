import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ItemListener{

    JCheckBox c1,c2,c3,c4;
    JTextArea t1;

 Myframe()
     {
        Container c = getContentPane();
        c.setLayout(null);

        c1 = new JCheckBox("10th");
        c2 = new JCheckBox("12th");
        c3 = new JCheckBox("btech");
        c4 = new JCheckBox("mtech");
        c1.setBounds(50,70,100,30);
        c2.setBounds(50,120,100,30);
        c3.setBounds(50,170,100,30);
        c4.setBounds(50,220,100,30);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        t1 = new JTextArea();
        t1.setBounds(200,70,200,200);
        c.add(t1);

        c1.addItemListener(this);
         c2.addItemListener(this);
          c3.addItemListener(this);
           c4.addItemListener(this);
     }

     public void itemStateChanged(ItemEvent e)
     {
       if(c1.isSelected())
       {
        t1.setText("10th");
       }
       if(c2.isSelected())
       {
        t1.setText(t1.getText()+"\n"+"12th");
       }
       if(c3.isSelected())
       {
        t1.setText(t1.getText()+"\n"+"btech");
       }
       if(c4.isSelected())
       {
        t1.setText(t1.getText()+"\n"+"mtech");
       }

     }
}
class ItemEvent3
{
    public static void main(String args [])
    {
        Myframe f = new Myframe();
        f.setTitle("ITEM EVENT");
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
        
    