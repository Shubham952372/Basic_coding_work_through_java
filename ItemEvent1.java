import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ItemListener
{
    JComboBox combo;
    JTextArea t1;
    Myframe ()
    {
        Container c = getContentPane();
        c.setLayout(null);

        String [] s ={"A","B","C","D"};
        combo = new JComboBox(s);
        combo.setBounds(50,50,100,30);
        c.add(combo);

        t1 = new JTextArea();
        t1.setBounds(250,50,100,100) ;
        c.add(t1);

        combo.addItemListener(this);


    }


    public void itemStateChanged(ItemEvent e)
    {
        String str =  combo.getSelectedItem().toString();
        t1.setText(str);
    }
}
class ItemEvent1{
    public static void main(String args [])
    {
        Myframe f = new Myframe();
        f.setTitle("ITEM FRAME");
        f.setBounds(100,100,400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}