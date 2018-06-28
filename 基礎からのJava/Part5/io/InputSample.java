import java.io.*;
import java.util.Arrays;

class InputSample {
    public static void main(String[] args) throws IOException {
        String path = "btest.bin";
        InputStream in = new FileInputStream(path);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        int len;
        byte[] b = new byte[1024];
        while ((len = in.read(b)) != -1) {
            out.write(b, 0, len);
        }
        in.close();
        byte[] result = out.toByteArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(Integer.toHexString(result[i]));
        }
    }
}