class Car
{
    protected int num;
    protected double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("Create Car");
    }
    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("Set "+num+" "+gas);
    }
    public void show(){
        System.out.println(num);
        System.out.println(gas);
    }
}
class RacingCar extends Car{
    private int course;

    public RacingCar(){
        course = 0;
        System.out.println("Set "+ course);
    }
    public void setCource(int c){
        course = c;
        System.out.println(course);
    }
    public void show(){
        System.out.println(num);
        System.out.println(gas);
        System.out.println(course);
    }
}
class Sample5
{
    public static void main(String[] args) {
        Car car1;
        car1 = new RacingCar();
        car1.setCar(1234, 30.5);
        car1.show();
    }
}