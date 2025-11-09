// Q9: Nested packages simulation
public class Q9_NestedPackageAccess {
    static class Inner {
        void greet() { System.out.println("Hello from inner class!"); }
    }
    public static void main(String[] args) {
        new Inner().greet();
    }
}