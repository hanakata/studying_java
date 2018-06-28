import java.util.*;

class IteratorSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Tokyo");
        list.add("London");
        list.add("Pari");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
        }
    }
}