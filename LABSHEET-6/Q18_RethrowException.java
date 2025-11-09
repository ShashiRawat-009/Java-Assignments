// Q18: Rethrowing exception
public class Q18_RethrowException {
    static void process() throws Exception {
        try {
            throw new Exception("Initial Exception");
        } catch (Exception e) {
            System.out.println("Logging: " + e.getMessage());
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}