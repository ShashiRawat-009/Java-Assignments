// Q19: Catch superclass and subclass exceptions
import java.io.*;
public class Q19_SuperclassCatch {
    static void mayThrow(boolean flag) throws IOException {
        if (flag) throw new FileNotFoundException("File missing");
        else throw new IOException("General IO error");
    }
    public static void main(String[] args) {
        try {
            mayThrow(true);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    }
}