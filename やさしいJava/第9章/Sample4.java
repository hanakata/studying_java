class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("Create Car");
    }

    public void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class Sample4 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.show();
    }
}