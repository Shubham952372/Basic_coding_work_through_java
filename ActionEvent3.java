import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener
{
    JMenuBar menubar;
    JMenu file,edit;
    JMenuItem i1,i2,i3,i4,i5;
    JTextArea t1;

    Myframe()
    {
       Container c = getContentPane();
       setLayout(null);

       menubar = new JMenuBar();

       file = new JMenu("file");
       
       i1 = new JMenuItem("new");
       i2 = new JMenuItem("open");
       i3 = new JMenuItem("save");

       file.add(i1);
       file.add(i2);
       file.add(i3);

       menubar.add(file);

       edit = new JMenu("edit");
       i4 = new JMenuItem("redo");
       i5 = new JMenuItem("undo");

       edit.add(i4);
       edit.add(i5);

       menubar.add(edit);
      this.setJMenuBar(menubar);

      t1 = new JTextArea();
      t1.setBounds(200,200,100,100);
      c.add(t1);

      i1.addActionListener(this);
      i2.addActionListener(this);
      i3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==i1)
      {
         t1.setText("new file");
      } 
      if(e.getSource()==i2)
      {
         t1.setText("open...");
      }
      if(e.getSource()==i3)
      {
         t1.setText("save the file");
      } 
    }
}

class ActionEvent3
{
    public static void main(String args [])
    {
        Myframe f = new Myframe();
        f.setTitle("action event");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}