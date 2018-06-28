import java.util.*;

class MapSample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("red", "aka");
        map.put("blue", "ao");
        map.put("yellow", "kiiro");

        String value = map.get("blue");
        System.out.println(value);
    }
}