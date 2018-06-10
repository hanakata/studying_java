import java.io.*;
class Sample1
{
    public static void main(String[] args) throws IOException {
        System.out.println("num input:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 1)
            System.out.println("input is 1");
        System.out.println("End");
    }
}