import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouseDemo extends JFrame implements MouseListener {
    JLabel label;

    mouseDemo(){
        this.setTitle("Mouse Event Listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,350);
        this.setLayout(null);

        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }
    @Override
    public  void mouseClicked(MouseEvent e){
    System.out.println("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered component");
        label.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited");
        label.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new mouseDemo();
    }
}
