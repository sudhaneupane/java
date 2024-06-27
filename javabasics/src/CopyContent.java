
import java.io.*;

public class CopyContent {

    public static void main(String[] args) {
        String src="source.txt";
        String dst="destination.txt";
            try (FileInputStream in = new FileInputStream(src); FileOutputStream out = new FileOutputStream(dst)) {
                byte[] byt = new byte[1024];
                int c;
                while ((c = in.read(byt)) > 0) {
                    out.write(byt, 0, c);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
}
