import java.io.*;

class Sample10
{
    public static void main(String[] args)throws IOException {
        System.out.println("num");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        switch(res){
            case 1:
            case 2:
                System.out.println("fight");
                break;
            case 3:
            case 4:
                System.out.println("OK");
                break;
            case 5:
                System.out.println("Great");
                break;
            default:
                System.out.println("input 1~5");
                break;
        }
    }
}