// package Full for java prog;
// manual type casting in java (Narrowing)
public class Ex5 {
    public static void main(String args[]){
        double db=90.8557; // value define in boolean datatype
        int idb= (int)db; // convert boolean to integer
        float fdb= (float)db; // convert boolean to float
        char ct= (char)idb; // convert integer to character

       System.out.println(db);
       System.out.println(idb);
       System.out.println(fdb);
       System.out.println(ct);
    }
    
}
