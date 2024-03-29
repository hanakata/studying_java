import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferReader reader = new BufferReader(new FileReader("program.txt"));
            String text;
            while((text = reader.readLine()) != null){
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        }catch(Exceptin e){
            e.printStackTrace();
        }
    }
}