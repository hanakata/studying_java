class Human2 extends Ape {
    String item = "Pasocon";

    void talk() {
        System.out.println("Morning");
    }
}

class Human2Main {
    public static void main(String[] args) {
        Human2 h = new Human2();

        System.out.println(h.favorite);
        h.sleep();

        System.out.println(h.item);
        h.talk();
    }
}