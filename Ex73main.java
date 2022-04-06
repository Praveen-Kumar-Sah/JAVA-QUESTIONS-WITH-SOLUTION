// import javax.swing.text.StyledEditorKit.BoldAction;

// inheriting class Ex70,71,72
public class Ex73main {
    public static void main(String args[]){
        Ex71 teach = new Ex71();

        teach.name = "Mr.harry";
        
        teach.eat();

        teach.walk();

        teach.teacher();

        Ex72 s = new Ex72();
        s.name="Atif-aslam";
        
        s.sing();
        s.eat();


        // casting up and down always check on runtime not compile time

        Ex71  t1= new Ex71();
        t1.eat();
        
        Ex72 s1 = new Ex72();

        Ex70 p=t1;

        Ex71 t=(Ex71)p;

        // check in boolean format
        boolean yo = t1 instanceof Ex71;
        System.out.println(t1 instanceof Ex71);
        System.out.println(s1 instanceof Ex72);
        System.out.println(t1 instanceof Ex70);

        System.out.println(t instanceof Ex70);
        System.out.println(p instanceof Ex72);
    }
    
}
