import java.util.Observer; 
import java.util.Observable;  
// This is the observer 
class HexaObserver extends Observer1 
{ 
    
    public void update(Observable obj, Object arg)  
    { 
        System.out.println( "Hex String: " + Integer.toHexString( (int) arg)); 
    } 
}