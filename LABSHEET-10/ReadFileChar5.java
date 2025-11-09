import java.io.*;

public class ReadFileChar5 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("Java assignment")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

