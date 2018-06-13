class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("Create car");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
    }

    public void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class Sample7
{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCar(1234,20.5);
        car1.show();

        Car car2 = new Car();
        car1.setCar(4567,30.5);
        car1.show();
    }
}