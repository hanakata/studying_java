class CarException extends Exception {
}

class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("Create Car");
    }

    public void setCar(int n, double g) throws CarException {
        if (g < 0) {
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("Setting " + num + gas);
        }
    }

    public void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class Sample5 {
    public static void main(String[] args) {
        Car car1 = new Car();
        try {
            car1.setCar(1234, -10.0);
        } catch (CarException e) {
            System.out.println(e);
        }
        car1.show();
    }
}