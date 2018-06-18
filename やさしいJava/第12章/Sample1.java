abstract class Vehicle
{
    protected int speed;
    public void setSpeed(int s){
        speed = s;
        System.out.println(speed);
    }
    abstract void show();
}
class Car extends Vehicle
{
    private int num;
    private double gas;
    public Car(int n,double g){
        num = n;
        gas = g;
        System.out.println(num + gas);
    }
    public void show(){
        System.out.println(num);
        System.out.println(gas);
        System.out.println(speed);
    }
}
class Plane extends Vehicle
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println(flight);
    }
    public void show(){
        System.out.println(flight);
        System.out.println(speed);
    }
}
class Sample1
{
    public static void main(String[] args) {
        Vehicle[] vc;
        vc = new Vehicle[2];

        vc[0] = new Car(1234,20.5);
        vc[0].setSpeed(5);

        vc[1] = new Plane(232);
        vc[1].setSpeed(500);

        for(int i=0;i<vc.length;i++){
            vc[i].show();
        }
    }
}