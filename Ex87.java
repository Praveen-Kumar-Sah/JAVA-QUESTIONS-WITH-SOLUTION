// Exception handeling in java try, throw and catch
public class Ex87{
    public static void main(String args[]){
        try{
            int a=5;
            int b=0;

            int arr[] = new int[5];
            System.out.println(arr[6]);
            // here we are throwing 
            int c = a/b ;
            System.out.println(c);
        }catch(ArithmeticException e){ // arithmatic exception
           System.out.println(e.getMessage()+" occured please check your code");
        }catch(ArrayIndexOutOfBoundsException e){ // array exception
            System.out.println("index shoud out of the range 0 to size of arrya.");
        }catch(IllegalArgumentException e){ // casting exception
            System.out.println("check your casting carefully");
        } finally{ // it run always
            System.out.println("Sorry for the inconvenience");
        }
        System.out.println("very important to run code");
    }

}