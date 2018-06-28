import java.util.*;

class ArraySample {
    public static void main(String[] args) {
        String[] array = new String[] { "Tokyo", "London", "Pari" };

        List<String> list = Arrays.asList(array);
        System.out.println("List");
        for (String s : list) {
            System.out.println(s);
        }

        String[] array2 = list.toArray(new String[0]);
        System.out.println("Array");
        for (String s : array2) {
            System.out.println(s);
        }
    }
}