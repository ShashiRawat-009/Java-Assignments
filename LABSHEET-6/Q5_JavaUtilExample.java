// Q5: Using java.util package
import java.util.*;
public class Q5_JavaUtilExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}