import java.util.*;

class VectorSample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();
        list.add("Tokyo");
        list.add("London");
        list.add("Pari");

        Enumeration<String> items = list.elements<String>();
        while(items.hashMoreElements()){
            String item = item.nextElement();
            System.out.println(item);
        }
    }
}