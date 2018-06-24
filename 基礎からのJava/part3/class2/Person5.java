class Person5{
    String name;
    int age;
    Person5(String iname,int iage){
        name = iname;
        age = iage;
    }

    Person5(String iname){
        name = iname;
        age = 99;
    }

    void showInfo(){
        System.out.println(name + " "+ age);
    }
}
class Person5Main{
    public static void main(String[] args) {
        Person5 p1 = new Person5("Alice",10);
        p1.showInfo();

        Person5 p2 = new Person5("Bob");
        p2.showInfo();
    }
}