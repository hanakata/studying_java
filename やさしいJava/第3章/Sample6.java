import java.io.*;

class Sample6
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("num two input:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println(num1);
        System.out.println(num2);
    }
}