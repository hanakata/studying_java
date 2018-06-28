import java.io.*;

class WriterSample2 {
    public static void main(String[] args) throws IOException {
        String path = "hoge.txt";

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path)));

        out.println("foo");
        out.println("bar");
        out.close();
        System.out.println("END");
    }
}