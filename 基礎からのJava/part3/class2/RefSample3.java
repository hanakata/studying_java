class RefSample3{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        Person p2 = p1;

        System.out.println("First");
        p1.showInfo();
        p2.showInfo();

        p1.name = "Bob";

        System.out.println("Next");
        p1.showInfo();
        p2.showInfo();
    }
}