// package Full for java prog;
// ternary operator in nested if else
public class Ex15 {
    public static void main(String args[]){
        int a= 12,b=18,c=100;
        int result=0;

        result = ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));
        System.out.println("Greatest of three number using ternary operator is :"+result);
    }
    
}
