import java.util.*;

class ListSample6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Tokyo");
        list.add("London");
        list.add("Pari");

        for (String item : list) {
            System.out.println(item);
        }
    }
}