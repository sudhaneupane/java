import javax.swing.*;
import java.awt.*;

public class Graphs extends Canvas {
    public void paint(Graphics g){
        g.drawString("Hello",40,40);
        setBackground(Color.WHITE);
        g.fillRect(130,30,100,80);
        g.drawOval(30,130,50,60);
        setForeground(Color.RED);
        g.fillOval(130,130,50,60);
        g.drawArc(30,200,40,50,90,60);
        g.fillArc(30,130,40,50,180,40);
    }

    public static void main(String[] args) {
        Graphs gr=new Graphs();
        JFrame f=new JFrame();
        f.add(gr);
        f.setSize(400,400);
        f.setVisible(true);
    }

}
