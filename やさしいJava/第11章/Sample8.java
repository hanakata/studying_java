class Car
{
    protected int num;
    protected double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("Create Car");
    }
}
class Sample8
{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        Car car3;
        car3 = car1;

        boolean bl1 = car1.equals(car2);
        boolean bl2 = car1.equals(car3);

        System.out.println(bl1);
        System.out.println(bl2);
    }
}