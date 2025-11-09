import java.io.*;

public class BinaryData8 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("input.bin"));
             DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.bin"))) {

            int data;
            while ((data = dis.read()) != -1) {
                dos.write(data);
            }
            System.out.println("Binary data copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

