// constructor in java no-argument constructor(non- parameter)
class Vehicle{
    int wheel;
    Vehicle(){
        wheel=9;
    }
}
public class Ex58 {

    Ex58(){
        System.out.println("object is now created");
    }
    public static void main(String args[]){

        Ex58 obj = new Ex58();
        Vehicle v = new Vehicle();

        System.out.println(v.wheel+" Wheels");

    }
    
}
