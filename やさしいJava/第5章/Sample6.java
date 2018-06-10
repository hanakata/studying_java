import java.io.*;
class Sample6
{
    public static void main(String[] args) throws IOException{
        System.out.println("input num");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char res = str.charAt(0);

        switch(res){
            case 'a':
            System.out.println("input a");
            break;
            case 'b':
            System.out.println("input b");
            break;
            default:
            System.out.println("please input a or b");
            break;
        }
    }
}