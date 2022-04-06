// explicitly exception throw 
public class Ex88 {
    public static void main(String args[]) {

        try{
            fun1();
        }catch(Exception e){
            System.out.println(e.getMessage()+" print exception massage");
        }
    }

    static void fun1(){
        int a=5;
        int b=3;

        int c = a/b;
        System.out.println(c);

        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("danger was coming");
        }
    }
    
}
