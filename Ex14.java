// package Full for java prog;
// greatest of three number using nested if else
public class Ex14 {
    public static void main(String args[]) {
        int a = 12, b = 18, c = 20;
        int result = 0;

        if (a > b) {
            if (a > c) {
                result = a;
            } 
            else {
                result = c;
            }
        } 
        else {
            if (b > c) {
                result = b;
            } 
            else {
                result = c;
            }
        }
        System.out.println("Largest of given three number is :" + result);
    }

}
