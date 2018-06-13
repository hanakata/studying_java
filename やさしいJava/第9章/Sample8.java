class Car
{
    public static int sum = 0;
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("Create new car");
    }
    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("Set "+num+" "+gas);
    }
    public static void showSum()
    {
        System.out.println(sum);
    }
    public void show() {
        System.out.println(num);
        System.out.println(gas);
    }
}
class Sample8
{
    public static void main(String[] args) {
        Car.showSum();

        Car car1 = new Car();
        car1.setCar(1234,20.5);
        Car.showSum();
        Car car2 = new Car();
        car2.setCar(5678,30.5);
        Car.showSum();
    }
}