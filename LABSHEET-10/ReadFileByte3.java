import java.io.*;

public class ReadFileByte3 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Java I/O is powerful.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
