class Human extends Ape{
}
class HumanMain{
    public static void main(String[] args){
        Human h = new Human();

        System.out.println(h.favorite);
        h.sleep();
    }
}