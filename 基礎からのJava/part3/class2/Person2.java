class Person2{
    String name;
    int age;
    Person2(){
        System.out.println("Call Cotract");
        name = "Noname";
        age = 10;
    }
    void showInfo(){
        System.out.println(name + " " + age);
    }
}

class Person2Main{
    public static void main(String[] args) {
        System.out.println("before new");
        Person2 p = new Person2();

        System.out.println("after new");
        p.showInfo();
    }
}