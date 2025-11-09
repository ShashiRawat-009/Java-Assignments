import java.io.*;

public class InputToFile10 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("user_input.txt"))) {

            String line;
            System.out.println("Enter text (type 'stop' to finish):");
            while (!(line = br.readLine()).equalsIgnoreCase("stop")) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Input saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

