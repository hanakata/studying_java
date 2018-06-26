package foo;

public class Hello{
    public void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();
    }
}