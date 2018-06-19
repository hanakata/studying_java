class Car implements Runnable
{
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

class Sample6 {
    public static void main(String[] args) {
        Car car1 = new Car("No.1");
        Thread th1 = new Thread(car1);
        th1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main");
        }
            
    }
}