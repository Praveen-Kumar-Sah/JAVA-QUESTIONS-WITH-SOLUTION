// pair ArrayList in framework 
// import java.util.*;
public class Ex93 {
    public static void main(String args[]){
       
        // here <String, Integer> is generic type
        
        Ex94<String, Integer> e = new Ex94<String, Integer>("praveen", 20);
        Ex94<String, Integer> e1 = new Ex94<String, Integer>("raushan", 18);

        e.getDescription();
        e1.getDescription();
    }
    
}
