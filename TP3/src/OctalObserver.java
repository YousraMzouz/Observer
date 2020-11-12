
import java.util.Observer; 
import java.util.Observable;  
// This is the observer 
class OctalObserver extends Observer1
{ 
    
    public void update(Observable obj, Object arg)  
    { 
        System.out.println( "Octal String: " + Integer.toOctalString( (int)arg )); 
    } 
}