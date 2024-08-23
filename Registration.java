import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{


    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    JRadioButton male,female;
    JComboBox day,month,year;
    JTextArea a1,a2;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    Myframe()
    {
        setTitle("REGISTRATION FORM");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        l1= new JLabel("NAME");
        l1.setBounds(20,50,100,20);
        c.add(l1);

        t1= new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);
        
        l2= new JLabel("MOBILE");
        l2.setBounds(20,100,100,20);
        c.add(l2);

        t2= new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        l3 = new JLabel("GENDER");
        l3.setBounds(20,150,100,20);
        c.add(l3);

        male = new JRadioButton("MALE");
        male.setBounds(130,150,80,20);
        c.add(male);
        female = new JRadioButton("FEMALE");
        female.setBounds(220,150,80,20);
        c.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        l4 = new JLabel("DOB");
        l4.setBounds(20,200,100,20);
        c.add(l4);

        String d[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String m[] ={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        String y[] = {"2000","2001","2002","2003","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012"
        ,"2013","2014","2015"};

        day = new JComboBox(d);
        month = new JComboBox(m);
        year = new JComboBox(y);

        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,60,20);
        c.add(day);
        c.add(month);
        c.add(year);

        l5 = new JLabel("ADDRESS");
        l5.setBounds(20,250,100,20);
        c.add(l5);

        a1 = new JTextArea ();
        a1.setBounds(130,240,200,50);
        c.add(a1);

        terms = new JCheckBox("PLESAES CHECK TERMS AND CONDITIONS");
        terms.setBounds(50,300,250,20);
        c.add(terms);

        submit = new JButton("submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);

        a2= new JTextArea();
        a2.setBounds(350,50,300,300);
        c.add(a2);

        msg = new JLabel();
        msg.setBounds(20,400,250,20); 
        c.add(msg);

        submit.addActionListener(this);

        setVisible(true);
       


    }
    public void actionPerformed(ActionEvent e)
    {
        if(terms.isSelected())
        {
            msg.setText("REGISTRATION SUCCESSFULL");

            String name =  t1.getText();
            String mobile =  t2.getText();
            String gender = "male";
            if(female.isSelected())
            {
                gender="female";
            } 
            String dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
            String address = a1.getText();

            a2.setText("name : "+name+"\n"+"mobile :"+mobile+"\n"+"gender :"+gender+"\n"+"dob :"+dob+"\n"+"address :"+address);

           
           }
    }

}

class Registration
{
    public static void main(String args[])
    {
        Myframe f = new Myframe();
    }
}