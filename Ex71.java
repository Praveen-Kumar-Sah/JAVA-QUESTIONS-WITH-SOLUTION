public class Ex71 extends Ex70{

    public void teacher(){
        System.out.println(name+" is teaching");
    }

    // overriding
    public void eat(){
            // super keyword is used to extend parent class in child class
        super.eat();

        System.out.println("teacher "+name+" is eating");
    }
    
}
