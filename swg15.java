 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

 class swg15
 {
    public static void main(String args[])
    {
        JFrame  jf = new JFrame("MY COMBOBOX");
        jf.setSize(700,500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c= jf.getContentPane();
        c.setLayout(null);

         String [] values={"A","B","C","D"} ;

         JComboBox c1 = new JComboBox(values);
         c1.setBounds(100,100,100,20);
         c.add(c1);

         JButton b1 = new JButton("OK");
         b1.setBounds(250,100,100,30);
         c.add(b1);

         JLabel l1 =new JLabel("SELECT");
         l1.setBounds(100,300,100,30);
         c.add(l1);

         b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String item = (String)c1.getSelectedItem();
                l1.setText(item);
            }
         });

        // c1.setSelectedItem("B");
         c1.setSelectedIndex(3);
         c1.setFont(new Font("Arial",Font.BOLD,20));


        jf.setVisible(true);
    }
 }