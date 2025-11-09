import java.io.*;

public class AutoResource7 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output_auto.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }
            System.out.println("Auto resource management completed!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

