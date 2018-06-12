class Car {
    int num;
    double gas;

    void setNumGus(int n, double g) {
        num = n;
        gas = g;
        System.out.println(num + " " + gas);
    }

    void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class Sample5 {
    public static void main(String[] args) {
        Car car1 = new Car();
        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGus(number, gasoline);
        car1.show();
    }
}