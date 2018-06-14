class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("Create Car");
    }
    public void setCar(int n,double g) {
        num = n;
        gas = g;
        System.out.println("Setting Car");
    }
    public void show(){
        System.out.println(num);
        System.out.println(gas);
    }
}
class RacingCar extends Car
{
    private int course;
    public RacingCar(){
        course = 0;
        System.out.println("Create RacingCar");
    }
    public void setCourse(int c)
    {
        course = c;
        System.out.println(c);
    }
    public void newShow()
    {
        System.out.println(num);
        System.out.println(gas);
        System.out.println(course);
    }
}

class Sample3
{
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.newShow();
    }
}