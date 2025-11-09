import java.io.*;

public class MultiLineInput9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Enter text (type 'exit' to quit):");

        while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
            System.out.println("You typed: " + line);
        }
        br.close();
    }
}

