 import javax.swing.*;
 import java.awt.*;

 class swg13
 {
    public static void main(String args [])
    {
        JFrame jf = new JFrame();
        jf.setBounds(100,100,700,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JRadioButton rb1 = new JRadioButton("MALE");
        rb1.setBounds(100,50,80,20);
        c.add(rb1);

        JRadioButton rb2 = new JRadioButton("FEMALE");
        rb2.setBounds(200,50,80,20);
        c.add(rb2);

        ButtonGroup g1 = new ButtonGroup();
        g1.add(rb1);
        g1.add(rb2);

        rb1.setSelected(true);
        rb1.setEnabled(false);

        JRadioButton gen = new JRadioButton("GENERAL"); 
        gen.setBounds(100,100,80,20);
        c.add(gen);
        JRadioButton obc = new JRadioButton("OBC");
        obc.setBounds(200,100,80,20);
        c.add(obc);
        JRadioButton sc = new JRadioButton("SC");
        sc.setBounds(300,100,80,20);
        c.add(sc);
        JRadioButton st = new JRadioButton("ST");
        st.setBounds(400,100,80,20);
        c.add(st);

        ButtonGroup g2 =new ButtonGroup();
        g2.add(gen);
        g2.add(obc);
        g2.add(sc);
        g2.add(st);

        gen.setSelected(true);
        obc.setEnabled(false);



        jf.setVisible(true);
       


    }
 }