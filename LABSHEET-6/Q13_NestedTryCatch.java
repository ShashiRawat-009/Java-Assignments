// Q13: Nested try-catch
public class Q13_NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int x = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
                throw e;
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}