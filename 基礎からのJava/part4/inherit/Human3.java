class Human3 extends Ape {
    void earAndSleep() {
        System.out.println(favorite);
        sleep();
    }
}

class Human3Main {
    public static void main(String[] args) {
        Human3 h = new Human3();
        h.earAndSleep();
    }
}