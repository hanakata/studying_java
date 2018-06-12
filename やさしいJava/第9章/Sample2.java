class Car {
    private int num;
    private double gas;

    public void setNumGas(int n, double g) {
        if (g > 0 && g < 1000) {
            num = n;
            gas = g;
            System.out.println("set ok");
        } else {
            System.out.println(g);
            System.out.println("set ng");
        }
    }

    public void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}

class Sample2
{
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234,20.0);
        car1.show();        
    }
}