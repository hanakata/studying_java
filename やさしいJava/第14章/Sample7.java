import java.io.*;

class Sample7 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test")));

            pw.println("aaa");
            pw.println("bbb");
            System.out.println("output");

            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}