import java.util.Observer; 
import java.util.Observable;  
// This is the observer 
class BinaryObserver extends Observer1
{ 
    
    public void update(Observable obj, Object arg)  
    { 
        System.out.println( "Binary String: " + Integer.toBinaryString( (int)arg )); 
    } 
}