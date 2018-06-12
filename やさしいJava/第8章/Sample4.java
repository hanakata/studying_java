class Car {
    int num;
    double gas;

    void setNum(int n) {
        num = n;
        System.out.println(num);
    }

    void setGas(double g) {
        gas = g;
        System.out.println(gas);
    }

    void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class Sample4 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setNum(1234);
        car1.setGas(20.5);
    }
}