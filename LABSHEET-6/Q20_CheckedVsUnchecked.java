// Q20: Checked vs Unchecked exception
public class Q20_CheckedVsUnchecked {
    static void throwChecked() throws Exception {
        throw new Exception("Checked Exception");
    }
    public static void main(String[] args) {
        // Unchecked
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Unchecked caught: " + e);
        }
        // Checked
        try {
            throwChecked();
        } catch (Exception e) {
            System.out.println("Checked caught: " + e);
        }
    }
}