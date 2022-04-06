// java always pass by values , not by reference
public class Ex57 {
    public static void main(String args[]){

        int c=34;
        int d=12;

        swap(c,d);

        System.out.println(c + " "+d);

        Dog e=new Dog();
        e.legs=4;
        Dog f=new Dog();
        f.legs=5;
        
        swap(e,f);
        System.out.println(e.legs+" "+f.legs);

        // chnage e values 
        changeDog(e);
        System.out.println(e.legs);
        

    }
     // swap by primitive data type
    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }
   // swap by non-primitive data type
    static void swap(Dog a, Dog b){
        Dog temp=a;
        a=b;
        b=temp;
    }
    // change the value legs of dog by change method
    static void changeDog(Dog dog){
        dog.legs=9;
    }
    
}
// creating non-primitive class
class Dog{
    int legs;
}
