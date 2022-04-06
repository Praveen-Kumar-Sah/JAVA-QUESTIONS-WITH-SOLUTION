// package Full for java prog;
// nested if conditional statement
public class Ex13 {
    public static void main(String args[]) {
        int age = 19;
        int weight = 50;

        if (age >= 18) {
            if (weight >= 60) {
                System.out.println("You can donate blood");
            } else {
                System.out.println("You can not donate blood becouse your weight is low");
            }
        } else {
            System.out.println("You can not donate blood becouse your age and weight is low");
        }

    }

}
