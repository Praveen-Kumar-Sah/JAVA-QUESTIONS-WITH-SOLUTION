// oops in java ,class and objects here only main class  will be public
class Cat{
    boolean hasfur;
    String color, breed;
    int eye,legs;

    public void walk(){
        System.out.println("cat is walking");
    }
    public void eat(){
        System.out.println("cat is eating");
    }
    public void discription(){
        System.out.println("my cat has "+legs+" legs and "+eye+" eyes");
    }
}
class Dog{
    String color,name;

    public void jump(){
        System.out.println("my dog "+name+" jumped");
    }
    public void description(){
        System.out.println("my dog is "+name+" and color is "+color);
    }
}
public class Ex54 {
    public static void main(String args[]){

        Cat c1 = new Cat();
        Cat c2  = new Cat();

        c1.legs=3;
        c2.legs=5;
        c1.eye=2;
        c2.eye=1;

        c1.discription();
        c2.discription();

        c1.walk();
        c1.eat();
        
        c2.walk();
        c2.eat();

        Dog d1 = new Dog();
        Dog d2 = new  Dog();

        d1.color="red";
        d1.name= "sheru";

        d2.color="black";
        d2.name="moti";

        d1.jump();
        d1.description();

        d1.jump();
        d2.description();

    }
    
}
