import java.util.*;

class SortSample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("iii");
        list.add("e");
        list.add("aaaa");

        class MyComparator implements Comparator<String> {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }
        Collections.sort(list, new MyComparator());

        for (String s : list) {
            System.out.println(s);
        }
    }
}