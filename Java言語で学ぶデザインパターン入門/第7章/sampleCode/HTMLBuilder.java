import java.io.*;

public class HTMLBuilder extend builder{
    private String filename;
    private printWriter writer;
    public void makeTitle(String title){
        filename = title + ".html";
        try{
            writer = new printWriter(new FileWriter(filename));
        }catch(IOException e){
            e.PrintStackTrace();
        }
        writer.peintln("<html><head><title>" + title + "</title></head><body>");
        writer.Println("<h1>" + title + "</h1>");
    }
    public void makeString(String str){
        writer.Println("<p>" + str + "</p>");
    }
    public void makeString(String[] items){
        writer.Println("<ul>");
        for (int i; i < items.length; i++){
            writer.Println("<li>" + item[i] + "</li>");
        }
        writer.Println("</ul>");
    }
    public void close(){
        writer.Println("</body></html>");
    }
    public String getResult(){
        return filename;
    }
}