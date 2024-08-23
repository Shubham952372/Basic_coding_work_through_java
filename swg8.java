import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swg8
{
    public static void main(String arg[])
    {
        JFrame jf = new JFrame("ACTION DEMO...");
        jf.setBounds(100,100,700,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JButton b1 = new JButton("click me");
        b1.setBounds(100,100,100,50);
        c.add(b1);

        b1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                c.setBackground(Color.GREEN);
            }
        });
    }
}
