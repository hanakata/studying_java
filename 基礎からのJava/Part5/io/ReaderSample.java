import java.io.*;

class ReaderSample {
    public static void main(String[] args) throws IOException {
        String path = "hoge.txt";

        BufferedReader in = new BufferedReader(new FileReader(path));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}