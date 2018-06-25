import java.util.Random;

class Sample{
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println(num);
    }
}