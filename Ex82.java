// Final keyword in java used to finalize the class,variable and method or function
public class Ex82 extends Ex83 {
    // Ex 83
    // public void getDescription(){
    //     System.out.println("inside main class");
    // }
    public static void main(String args[]){
        
        final String name = "praveen";
        // name = "raushan";
        System.out.println(name);

        Ex82 e = new Ex82();
        e.getDescription();
    }
}
