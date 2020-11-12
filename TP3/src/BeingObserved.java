import java.util.Observable; 
import java.util.concurrent.TimeUnit;
// This is class being observed 
class BeingObserved extends Observable 
{ 
 public static void wait(int ms)
{
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}

private int value=0;
 
   public void setValue() {
        while (true) {
         wait(2000);
        value=(value+1)%60;
        setChanged();
        notifyObservers(value);}
        
      }
    
   }