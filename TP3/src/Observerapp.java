public class Observerapp {

   public static void main(String[] args) {
 
      BeingObserved beingObserved = new BeingObserved(); 
        Observer1 observer1 = new BinaryObserver(); 
        beingObserved.addObserver(observer1);
        Observer1 observer2 = new OctalObserver(); 
        beingObserved.addObserver(observer2);
        Observer1 observer3 = new  HexaObserver(); 
        beingObserved.addObserver(observer3);
        beingObserved.setValue();
        
   }
    

}