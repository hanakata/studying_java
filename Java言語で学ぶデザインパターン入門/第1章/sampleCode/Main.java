public class Main{
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        BookShelf.appendBook(new Book("Around the World in 80 days"));
        BookShelf.appendBook(new Book("Bible"));
        BookShelf.appendBook(new Book("Cinderella"));
        BookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}