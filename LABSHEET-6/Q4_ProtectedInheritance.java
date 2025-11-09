// Q4: Protected access via inheritance across packages simulated
class Parent {
    protected void show() {
        System.out.println("Protected method accessed via inheritance");
    }
}
public class Q4_ProtectedInheritance extends Parent {
    public static void main(String[] args) {
        new Q4_ProtectedInheritance().show();
    }
}