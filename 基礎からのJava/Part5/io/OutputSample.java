import java.io.*;

class OutputSample {
    public static void main(String[] args) throws IOException {
        String path = "btest.bin";
        OutputStream out = new FileOutputStream(path);

        byte[] b = new byte[] { 0x0a, 0x0b, 0x0c };
        out.write(b);
        out.close();
        System.out.println("End");
    }
}