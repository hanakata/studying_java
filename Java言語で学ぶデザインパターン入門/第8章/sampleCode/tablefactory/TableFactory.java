package tablefactory;
import factory.*;

public class TableFacotory extends Factory{
    public Link createLink(String caption, String url){
        return new TableLink(caption,url);
    }
    public Tray createTray(String caption){
        return new TableTray(caption);
    }
    public Page createPage(String title, String author){
        return new TablePage(title, author);
    }
}