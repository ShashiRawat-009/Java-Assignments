// Q2: Access modifiers and import simulation
class Vehicle {
    public void display() { System.out.println("Public method"); }
    protected void service() { System.out.println("Protected method"); }
    void repair() { System.out.println("Package-private method"); }
    private void secret() { System.out.println("Private method"); }
}
public class Q2_TestAccess extends Vehicle {
    public static void main(String[] args) {
        Q2_TestAccess obj = new Q2_TestAccess();
        obj.display();
        obj.service();
        obj.repair();
    }
}