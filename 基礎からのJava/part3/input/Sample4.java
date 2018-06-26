import java.util.Scanner;

public class Sample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT:");

        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("NOT NUM");
            return;
        }
        System.out.println(num);
    }
}