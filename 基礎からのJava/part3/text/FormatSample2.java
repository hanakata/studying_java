import java.text.DecimalFormat;
import java.text.ParseException;

class FormatSample2 {
    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("###,###");
        Number num = df.parse("120,000");
        int n = num.intValue();
        System.out.println(n);
    }
}