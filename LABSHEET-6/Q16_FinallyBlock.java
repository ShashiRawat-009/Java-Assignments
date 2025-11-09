// Q16: Finally block demonstration
public class Q16_FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Caught exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}