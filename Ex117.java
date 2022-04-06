// Hash Maps in java
public class Ex117 {
    public static void main(String[] args) {
        System.out.println(getHash("DOG"));
        System.out.println(getHash("GOD"));
    }
    public static int getHash(String s){
        int hash = 0;
        for(int i=0; i<s.length();i++){
            hash = hash + s.charAt(i);
        }
        return hash;
    }
    
}
