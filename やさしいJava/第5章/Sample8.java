import java.io.*;
class Sample8
{
    public static void main(String[] args) throws IOException{
        System.out.println("select course");
        System.out.println("input num");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);

        char ans = (res == 1) ? 'A' : 'B';

        System.out.println(ans);
    }
}