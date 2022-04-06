// static keyword in java , it is relatted to class and not relatted to object 
// we can not change variable when we used static keyword
public class Ex67{

    static {
        System.out.println("in block 1");
    }

    static{
        System.out.println("in block 2");
    }
    public static void main(String args[]){
        
        System.out.println("in main block");

        System.out.println(Math.max(29, 59));

        Ex68 ob = new Ex68();
        System.out.println(ob.name);

        // from Ex69

        Ex69 obm = new Ex69();
        Ex69.A oba = obm.new A();

        Ex69.B obb = new Ex69.B();

    }
    static {
        System.out.println("in odside main block 3");
    }

}