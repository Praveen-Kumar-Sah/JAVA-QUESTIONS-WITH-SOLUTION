// constructor overloading in java
class Vehicle{
    int wheels;
    String color;

    Vehicle(int wheels){
        this.wheels=wheels;
    }

    Vehicle(int wheels, String color){
        this. wheels = wheels;
        this. color = color;
    }
}
public class Ex60 {

    Ex60(){
        System.out.println("object is now created");
    }
    public static void main(String args[]){

        // Vehicle car = new Vehicle(4);
        // Vehicle scooty = new Vehicle(2);

        Vehicle eRikshaw = new Vehicle(3,"yellow");
        System.out.println(eRikshaw.wheels+" wheels and color "+eRikshaw.color);

    }
    
}
