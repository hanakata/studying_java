import java.util.*;

class SetSample2 {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<String>();
        set.add("Tokyo");
        set.add("London");
        set.add("Pari");

        for (String item : set) {
            System.out.println(item);
        }
    }
}