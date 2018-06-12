class Car {
    int num;
    double gas;

    void show() {
        System.out.println(num);
        System.out.println(gas);
    }

    void showCar() {
        System.out.println("show info:");
        show();
    }
}

class Sample3 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();
    }
}