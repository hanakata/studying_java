package pa;

class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("Create Car");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("Set " + num + gas);
    }

    public void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}