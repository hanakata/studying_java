package 第15章.sampleCode.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.swing.text.html.HTMLWriter;

public class PageMaker {
    private PageMaker(){

    }
    public static void makeWelcomePage(String mailaddr, String filename){
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HTMLWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s Page !");
            writer.paragraph(username + "のページへようこそ");
            writer.paragraph("メール待っていますね");
            writer.mailto(mailaddr,username);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
