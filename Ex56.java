// method overloading in java
public class Ex56 {
    public static void main(String args[]){

        int num1=34;
        int num2=50;

        int result= maxof(num1,num2); // calling method
        
        System.out.println(result);
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
    //  creating another method with same names and parameter
    static void maxof(int c , Float d){
        System.out.println("maximum of given number ");
    }
    
}

