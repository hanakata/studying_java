import java.util.*;

class ListSample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Tokyo");
        list.add("London");
        list.add("pari");

        String item = (String) list.get(1);
        System.out.println(item);
    }
}