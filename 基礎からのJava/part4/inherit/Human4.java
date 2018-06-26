class Human4 extends Ape {
    void sleep() {
        System.out.println("Good Sleep");
    }
}

class Human4Main {
    public static void main(String[] args) {
        Human4 h = new Human4();
        h.sleep();
    }
}