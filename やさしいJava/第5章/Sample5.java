import java.io.*;
class Sample5
{
    public static void main(String[] args) throws IOException{
        System.out.println("input num");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
            System.out.println("input 1");
            break;
            case 2:
            System.out.println("input 2");
            break;
            default:
            System.out.println("please input 1 or 2");
            break;
        }
    }
}