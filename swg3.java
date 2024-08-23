import javax.swing.*;
import java.awt.*;
 class swg3{
    public static void main(String args[])
    {
        JFrame jf =new JFrame();
        //jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,1000,300);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("password");
        label.setBounds(50,50,100,30);
        c.add(label);

        JTextField t1  = new JTextField();
        t1.setBounds(160,50,100,50);
        c.add(t1);

        t1.setText("shubham#123");
        Font font = new Font("Arial",Font.ITALIC,25);
        t1.setFont(font);

        t1.setForeground(Color.GREEN);
        t1.setBackground(Color.RED);

        t1.setEditable(false);


        jf.setVisible(true);
    }
 }