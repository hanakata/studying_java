class Car {
    int num;
    double gas;

    int getNum() {
        System.out.println("Check number");
        return num;
    }

    double getGas() {
        System.out.println("Check gas");
        return gas;
    }

    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println(num + " " + gas);
    }

    void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class Sample6 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setNumGas(1234, 20.5);

        int number = car1.getNum();
        double gasoline = car1.getGas();
        System.out.println("Check Sample");
        System.out.println(number);
        System.out.println(gasoline);
    }
}