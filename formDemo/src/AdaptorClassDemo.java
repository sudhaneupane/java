import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdaptorClassDemo extends JFrame {
    AdaptorClassDemo(){
        this.setTitle("Usage of adaptor class");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(null);
        JLabel label=new JLabel();
        label.setBounds(0,0,150,150);
        label.setBackground(Color.GRAY);
        label.setOpaque(true);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            @Override
            public  void mouseEntered(MouseEvent e){
                System.out.println("Mouse entered the component");
                label.setBackground(Color.PINK);
            }
            @Override
            public  void mouseExited(MouseEvent e){
                System.out.println("Mouse exited the component");
                label.setBackground(Color.BLUE);
            }
        });
        this.add(label);

        this.setVisible(true);
    }


    public static void main(String[] args) {
        new AdaptorClassDemo();
    }
}
