import java.util.*;

class SortSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("iii");
        list.add("uuu");
        list.add("aaa");

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}