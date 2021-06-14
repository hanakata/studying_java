package framework;
import java.util.*;

public class Manager{
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto){
        showcase.put(name,proto);
    }
    public Product create(String Protoname){
        Product p = (Product)showcase.get(Protoname);
        return p.createClone();
    }
}