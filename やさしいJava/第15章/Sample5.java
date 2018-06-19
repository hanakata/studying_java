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

class Sample5 {
    public static void main(String[] args) {
        Car car1 = new Car("No.1");
        car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
        }
        System.out.println("main finish");
    }
}