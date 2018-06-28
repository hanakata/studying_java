import java.util.*;

class ListSample4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Tokyo");
        list.add("London");
        list.add("Pari");

        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
    }
}