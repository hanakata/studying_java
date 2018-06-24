class PersonS{
    static int counter;
    
    String name;
    int age;

    PersonS(){
        counter++;
    }

    void showInfo(){
        System.out.println(name+" "+age);
    }
    static void showCount(){
        System.out.println(counter);
    }
}
class StaticSample{
    public static void main(String[] args) {
        PersonS.counter = 100;

        new PersonS();
        new PersonS();

        PersonS.showCount();
    }
}