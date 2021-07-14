package 第17章.sampleCode;

public class DigiObserver implements Observer{
    public void update(NumberGenerator generator){
        System.out.println("DigiObserver:" + generator.getNumber());
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            
        }
    }
    
}
