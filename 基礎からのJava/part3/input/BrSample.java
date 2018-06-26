import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BrSample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INPUT NUM:");
        String line = reader.readLine();
        int num = Integer.parseInt(line);
        System.out.println(num);
    }
}