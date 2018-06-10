import java.io.*;
class Sample3
{
    public static void main(String[] args) throws IOException{
        System.out.println("input num");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i = 1; i<=num; i++){
            System.out.print("*");
        }
    }
}