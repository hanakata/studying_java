import java.util.*;

class SetSample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Tokyo");
        set.add("Pari");
        set.add("London");

        for (String item : set) {
            System.out.println(item);
        }
    }
}