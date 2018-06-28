import java.util.*;

class MapSample2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("red", "aka");
        map.put("blue", "ao");
        map.put("yellow", "kiiro");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}