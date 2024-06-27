import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdaptorPractice extends JFrame {
    AdaptorPractice(){
        this.setTitle("This is my practice ");
        this.setSize(400,400);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label=new JLabel();
//        label.setBackground(Color.GREEN);
        label.setOpaque(true);
        label.setBounds(50,50,150,150);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the component");
                label.setBackground(Color.CYAN);
            }
            @Override
            public void mouseExited(MouseEvent e){
                System.out.println("Mouse exited the component");
                label.setBackground(Color.YELLOW);
            }
        });

        this.add(label);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AdaptorPractice();
    }
}
