import java.io.*;

public class CopyFileByte4 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("copy.txt")) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

