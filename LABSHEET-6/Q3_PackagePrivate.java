// Q3: Demonstrate package-private access
class A {
    String msg = "Package-private message";
}
public class Q3_PackagePrivate {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.msg);
    }
}