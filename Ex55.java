// method in java or function in java
public class Ex55 {
    public static void main(String args[]){

        int num1=34;
        int num2=50;

        int result= maxof(num1,num2); // calling method

        maxof(344, 342);
        
        System.out.println(result);

        say();
        say();
    }
     // creating method
    static int maxof(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
  // creating multiple method
    static void say(){
        System.out.println("hello praveen");
        System.out.println("Good morning");
    }
    
}
