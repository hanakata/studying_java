class Sample3{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Bob";
        p1.age = 10;

        p2.name = "Alice";
        p2.age = 12;

        showPair(p1,p2);
    }
    static void showPair(Person p1, Person p2){
        System.out.println(p1.name + " " + p2.name);
        System.out.println(p1.age+p2.age);
    }
}