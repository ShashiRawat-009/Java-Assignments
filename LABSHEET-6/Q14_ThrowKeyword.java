// Q14: Throw keyword example
public class Q14_ThrowKeyword {
    static void checkNumber(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number not allowed");
        System.out.println("Number is " + n);
    }
    public static void main(String[] args) {
        try {
            checkNumber(-1);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}