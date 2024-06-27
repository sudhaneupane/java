import javax.swing.*;
import java.awt.*;

class ImgTest extends JFrame {
    ImgTest() {
        setLayout(new FlowLayout());

        ImageIcon img = new ImageIcon("./linkedin.png");
//        JLabel l = new JLabel(img);
//        l.setIcon(img);

        JButton jBtn =  new JButton("hello",img);
        jBtn.setIcon(img);

        add(jBtn);
//        add(l);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ImgTest i1 = new ImgTest();
    }
}
