class Sample2{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Alice";
        p1.age = 10;

        p2.name = "Bob";
        p2.age = 12;

        p1.showInfo();
        p2.showInfo();
    }
}