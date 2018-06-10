import java.io.*;
class Sample3
{
    public static void main(String[] args) throws IOException{
        System.out.println("input num:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        if(res == 1){
            System.out.println("input 1");
        }else{
            System.out.println("input not 1");
        }
        System.out.println("End");
    }
}