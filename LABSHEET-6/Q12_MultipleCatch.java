// Q12: Multiple catch blocks
public class Q12_MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[5] = 10;
            String s = null;
            System.out.println(s.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (NullPointerException e) {
            System.out.println("Null pointer error");
        }
    }
}