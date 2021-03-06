package tablefactory;
import factory.*;
import java.util.Iterator;

public class TablePage extends Page{
    public TablePage(String title , String author){
        super(title,author);
    }
    public String makeHTML(){
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.Iterator();
        while (it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>\n");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}