import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener
{
    JButton b1;

    public Myframe ()
    {
      Container c = getContentPane();
      c.setLayout(null);

      b1 = new JButton("click me");
      b1.setBounds(100,100,100,20);
      c.add(b1);

      b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = b1.getText();
        b1.setText(s.toUpperCase());

    }
}

class ActionEvent1{
    public static void main(String args [])
    {
      Myframe f = new Myframe();
      f.setTitle("Action Event");
      f.setSize(500,500);
      f.setLocationRelativeTo(null);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    }
}