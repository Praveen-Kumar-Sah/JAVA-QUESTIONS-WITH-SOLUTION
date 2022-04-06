// convert temprature into ferenheit to degreen celcious
import java.util.*;
public  class Ex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature in celcious :");
        double c = sc.nextDouble();
        sc.close();
        double f = (c*9/5)+32;
        System.out.println("The temprature in ferenheoght is : "+f);
    }
} 