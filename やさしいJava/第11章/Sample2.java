class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("Create car");
    }

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("Create " + num + " " + gas);
    }
    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("Set " + num + " " + gas);
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
    public RacingCar(int n,double g,int c){
        super(n,g);
        course = c;
        System.out.println(course);
    }
}

class Sample2
{
    public static void main(String[] args) {
        RacingCar rccar1 = new RacingCar(1234,20.5,5);
    }
}