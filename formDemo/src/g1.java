import javax.swing.*;
import java.awt.*;

public class G1 extends Canvas {
    private Image img;

    public G1() {
        Toolkit t = Toolkit.getDefaultToolkit();
        img = t.getImage("360_F_210969565_cIHkcrIzRpWNZzq8eaQnYotG4pkHh0P9.jpg");
        if (img == null) {
            System.out.println("Image not loaded.");
        } else {
            System.out.println("Image loaded successfully.");
        }
    }

//    public void paint(Graphics g) {
//        ImageIcon img = new ImageIcon("./360_F_210969565_cIHkcrIzRpWNZzq8eaQnYotG4pkHh0P9.jpg");
//
//        if (img != null) {
//            g.drawImage(img, 120, 120, this);
//        }
//    }

    public static void main(String[] args) {
        G1 sudha = new G1();
        ImageTest t = new ImageTest(sudha);
    }
}

class ImageTest extends JFrame {
    ImageTest(G1 s) {
        ImageIcon img = new ImageIcon("./360_F_210969565_cIHkcrIzRpWNZzq8eaQnYotG4pkHh0P9.jpg");
        JLabel l = new JLabel();
        l.setIcon(img);
        setLayout(new FlowLayout());
        add(l);
        add(s);
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
