import java.util.Observer; 
import java.util.Observable;  
// This is the observer 
class Observer1 implements Observer 
{ 
    
    public void update(Observable obj, Object arg)  
    { 
        System.out.println(); 
    } 
}