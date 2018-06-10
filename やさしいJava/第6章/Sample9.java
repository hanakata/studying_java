import java.io.*;
class Sample9
{
    public static void main(String[] args)throws IOException {
        System.out.println("num");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i=1;i<=10;i++){
            System.out.println(i);
            if(i==res){
                break;
            }
        }
    }
}