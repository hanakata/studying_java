public class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){
        system.out.println("インスタンスを生成しました");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}