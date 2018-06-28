import java.io.*;

class WriterSample {
    public static void main(String[] args) throws IOException {
        String path = "hoge.txt";
        Writer out = new FileWriter(path);

        out.write("foo");
        out.write("bar");
        out.close();

        System.out.println("END");
    }
}