import static java.lang.Math.PI;
import static java.lang.Math.abs;

class StaticImportSample {
    public static void main(String[] args) {
        double pi = PI;
        System.out.println(pi);

        int num = abs(-10);
        System.out.println(num);
    }
}