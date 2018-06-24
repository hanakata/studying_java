class Person4{
    String name;
    int age;

    Person4(String iname,int iage){
        name = iname;
        age = iage;
    }
    void showInfo(){
        System.out.println(name+" "+ age);
    }
    void showInfo(String msg){
        System.out.println(msg +" " +name + " "+age);
    }
}
class Person4Main{
    public static void main(String[] args) {
        Person4 p = new Person4("Alice",10);
        p.showInfo();
        p.showInfo("msg");
    }
}