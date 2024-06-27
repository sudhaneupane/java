import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad implements ActionListener {
    JFrame f;
    JMenuBar m;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll;
    JTextArea ta;

    Notepad(){
        f=new JFrame();
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        selectAll=new JMenuItem("select all");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        m=new JMenuBar();
        m.setBounds(2,10,100,100);

        file=new JMenu("file");
        edit=new JMenu("edit");
        help=new JMenu("help");

        edit.add(cut);
        edit.add(paste);
        edit.add(copy);
        edit.add(selectAll);

        ta=new JTextArea();
        ta.setBounds(5,8,300,250);
        f.add(ta);
        f.add(m);

        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==cut){
            ta.cut();
        }
        if (e.getSource()==paste){
            ta.paste();
        }
        if (e.getSource()==copy){
            ta.copy();
        }
        if (e.getSource()==selectAll){
            ta.selectAll();
        }

    }
    public static void main(String[]args){
        new Notepad();
    }
}
