// Q17: throws keyword demonstration
import java.io.IOException;
public class Q17_ThrowsKeyword {
    static void risky() throws IOException {
        throw new IOException("File not found");
    }
    public static void main(String[] args) {
        try {
            risky();
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}