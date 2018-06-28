import java.io.*;

class FileCopy {
    public static void main(String[] args) throws IOException {
        String src = "hoge.txt";
        String dst = "hoge2.txt";

        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);

        int len;
        byte[] b = new byte[1024];
        while ((len = in.read(b)) != -1) {
            out.write(b, 0, len);
        }
        in.close();
        out.close();
    }
}