interface iVehicle
{
    void vShow();
}
interface iMaterial
{
    void mShow();
}
class Car implements iVehicle,iMaterial
{
    private int num;
    private double gas;

    public Car(int n,double g){
        num = n;
        gas = g;
        System.out.println("set"+num + gas);
    }
    public void vShow(){
        System.out.println(num);
        System.out.println(gas);
    }
    public void mShow(){
        System.out.println("material");
    }
}
class Sample4
{
    public static void main(String[] args) {
        Car car1 = new Car(1234,20.5);
        car1.vShow();
        car1.mShow();
    }
}