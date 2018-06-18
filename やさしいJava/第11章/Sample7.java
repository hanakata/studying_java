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
    public String toString(){
        String str = num + " " + gas;
        return str;
    }
}
class Sample7
{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCar(1234, 20.5);
        System.out.println(car1);
    }
}