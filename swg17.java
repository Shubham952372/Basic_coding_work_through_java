import javax.swing.*;
import java.awt.*;

public class swg17
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("MENUBAR EXAMPLE");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menubar = new JMenuBar();

        JMenu file  = new JMenu("file");

        JMenuItem i1 = new JMenuItem("NEW");
        JMenuItem i2 = new JMenuItem("OPEN");
        JMenuItem i3 = new JMenuItem("SAVE");

        file.add(i1);
        file.add(i2);
        file.add(i3);

        menubar.add(file);
        f.setJMenuBar(menubar);

        JMenu edit  = new JMenu("Edit");

        JMenuItem i4 = new JMenuItem("REDO");
        JMenuItem i5 = new JMenuItem("UNDO");

        edit.add(i4);
        edit.add(i5);

        file.add(edit);
        f.setJMenuBar(menubar); 



        f.setVisible(true);
    }
}