// constructor with parameter in java
class Vehicle{
    int wheel;
    Vehicle(int noOfwheel){
        wheel=noOfwheel;
        // int headlight = 2;
    }
}
public class Ex59 {
    Ex59(){
        System.out.println("object is now created");
    }
    public static void main(String args[]){
        
        Vehicle car = new Vehicle(4);
        Vehicle scooty = new Vehicle(2);

        System.out.println(car.wheel+" wheels in car");
        System.out.println(scooty.wheel+" wheels in scooty");
        
    }
    
}
