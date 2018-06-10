import java.io.*;

class Sample4
{
    static public void main(String[] args) throws IOException
    {
        System.out.println("String input:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);
    }
}