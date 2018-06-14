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
        System.out.println("Set " + num + " " + gas);
    }

    public void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("Create Raceing Car");
    }

    public void setCource(int c) {
        course = c;
        System.out.println("Cource NO. " + course);
    }
}

class Sample1 {
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.setCar(1234, 20.5);
        rccar1.setCource(5);
    }
}