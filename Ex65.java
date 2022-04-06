// Encapsulation in java
public class Ex65 {
    // private String name;
    private int age;
    
    // when i declare private access modifier then i have to create gatter and satter method

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>20){
            System.out.println("you are to old to be a student");
        }
        else{
            this.age = age;
        }
    }
}
