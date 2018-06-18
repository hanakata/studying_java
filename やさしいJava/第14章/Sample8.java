import java.io.*;

class Sample8 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test"));

            String str1 = br.readLine();
            String str2 = br.readLine();
            System.out.println(str1);
            System.out.println(str2);

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}