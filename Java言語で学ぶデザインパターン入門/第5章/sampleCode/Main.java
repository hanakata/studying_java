public class Main{
    public static void main(String[] args){
        System.out.println("Start.");
        Singleton obj1 = singleton.getInstance();
        Singleton obj2 = singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("同じインスタンス");
        }else{
            System.out.println("違うインスタンス");
        }
        System.out.println("End");
    }
}