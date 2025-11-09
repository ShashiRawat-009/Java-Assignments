import java.io.*;

public class WriteFile6 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("This text is written to a file using FileWriter.\n");
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
