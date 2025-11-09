import java.io.*;

public class ReadConsole1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter a line: ");
        String line = br.readLine();
        System.out.println("You entered: " + line);
        br.close();
    }
}

