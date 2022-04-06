// explicitly exception throws and throw
public class Ex89 {
    public static void main(String args[]) {
        fun1();
    }

    static void fun1(){
        int a=5;
        int b=3;

        int c = a/b;
        System.out.println(c);
        try{
            fun2();
        }catch(Exception e){
            System.out.println(e.getMessage()+" occured");
        }
    }

    static void fun2() throws ArrayIndexOutOfBoundsException{
        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("danger was coming");
        }
    }
    
}

