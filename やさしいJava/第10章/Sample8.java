class Car {
    private int num;
    private double gas;
    private String name;

    public Car() {
        num = 0;
        gas = 0.0;
        name = "Noname";
        System.out.println("Create Car");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("Setting " + num + " " + gas);
    }

    public void setName(String nm) {
        name = nm;
        System.out.println(name);
    }

    public void show() {
        System.out.println(num);
        System.out.println(gas);
        System.out.println(name);
    }
}

class Sample8 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.show();

        int number = 1234;
        double gasoline = 20.5;
        String str = "No.1 Car";
        car1.setCar(number,gasoline);
        car1.setName(str);

        car1.show();
    }
}