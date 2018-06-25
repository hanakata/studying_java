import java.text.DecimalFormat;

class FormatSample {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        String text = df.format(1.2345566789);
        System.out.println(text);
    }
}