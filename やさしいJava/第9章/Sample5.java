class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("Create car");
    }

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println(num + " " + gas + "Create car");
    }

    public void show(){
        System.out.println(num);
        System.out.println(gas);
    }
}
class Sample5 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.show();
        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}
