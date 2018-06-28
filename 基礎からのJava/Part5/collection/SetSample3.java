import java.util.*;

class SetSample3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Tokyo");
        set.add("London");
        set.add("Pari");

        if (!set.add("London")) {
            System.out.println("Can not add London");
        }
        if (set.contains("London")) {
            System.out.println("Exist London");
        }

        for (String item : set) {
            System.out.println(item);
        }
    }
}