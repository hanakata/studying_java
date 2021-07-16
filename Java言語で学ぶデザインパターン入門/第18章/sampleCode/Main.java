import game.Memento;
import geme.Gamer;

public class Main{
    public static void main(String[] args){
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for(int i = 0;i < 100; i++){
            System.out.println("=== " + i);
            System.out.println("現状：" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました");
            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("(増えたので現在の状態を保存)");
                memento = gamer.createMemento();
            }else if{(game.getMoney() < memento.getMoney() / 2)
                System.out.println("(減ったので復元)");
                gamer.restoreMemento(memento);
            }
            tty{
                thread.Sleep(1000);

            }catch(InterruptedException e){

            }
            System.out.println("")
        }
    }
}