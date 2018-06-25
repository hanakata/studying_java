import java.text.SimpleDateFormat;
import java.util.Date;

class DateSample3 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        String text = df.format(date);
        System.out.println(text);
    }
}