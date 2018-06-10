import java.io.*;
class Sample7
{
    public static void main(String[] args) throws IOException {
        System.out.println("Are you man?");
        System.out.println("input y or n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char res = str.charAt(0);
        
        if(res == 'Y' || res == 'y'){
            System.out.println("You are man");
        }
        else if(res == 'N' || res == 'n'){
            System.out.println("you are woman");
        }
        else{
            System.out.println("input y or n");
        }
    }
}