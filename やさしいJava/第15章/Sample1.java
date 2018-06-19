class Car extends Thread {
    private String name;

    public Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }
}

class Sample1 {
    public static void main(String[] args) {
        Car car1 = new Car("No.1");
        car1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main");
        }
    }
}