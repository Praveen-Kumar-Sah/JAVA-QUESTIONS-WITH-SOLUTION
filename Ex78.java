import javax.swing.RepaintManager;

// abs repair shop
public class Ex78 {
    public static void repaircar(Ex76 car){
        System.out.println("Wegnor car is repaired");
    }
    public static void repaircar(Ex77 car){
        System.out.println("Audi car is repaired");
    }
    public static void main(String args[]){
        Ex76 wag  = new Ex76();
        Ex77 aud = new Ex77();

        repaircar(wag);
        repaircar(aud);
    }
    
}
