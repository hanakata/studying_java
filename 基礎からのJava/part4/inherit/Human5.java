class Human5 extends Ape {
    void sleep() {
        System.out.println("Hunmoc");
        super.sleep();
    }
}

class Human5Main {
    public static void main(String[] args) {
        Human5 h = new Human5();
        h.sleep();
    }
}