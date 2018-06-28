import java.util.*;

class ListSample2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Tokyo");
        list.add("London");
        list.add("Pari");

        for (int i = 0; i < list.size(); i++) {
            String item = (String) list.get(i);
            System.out.println(item);
        }
    }
}