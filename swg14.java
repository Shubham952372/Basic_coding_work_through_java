import javax.swing.*;
import java.awt.*;

class swg14
{
    public static void main(String args [])
    {
        JFrame jf = new JFrame();
        jf.setBounds(100,100,700,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

      //  Font font = new Font("Arial",Font.ITALIC,15);
      //  c1.setFont(font);
        

        JCheckBox c1 = new JCheckBox("high school");
        JCheckBox c2 = new JCheckBox("intermediate");
        JCheckBox c3 = new JCheckBox("graduate");
        JCheckBox c4 = new JCheckBox("post graduate");

        c1.setBounds(100,100,200,20);
        c2.setBounds(100,140,200,20);
        c3.setBounds(100,180,200,20);
        c4.setBounds(100,220,200,20);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        Font font = new Font("Arial",Font.ITALIC,15);
        c1.setFont(font);
        c2.setFont(font);
        c3.setFont(font);
        c4.setFont(font);

        c4.setEnabled(false);
       

       c1.setSelected(true);



        jf.setVisible(true);

    }
}