// singleton
public class Ex75singleton {
    
    private Ex75singleton(){
        System.out.println("this is singleton method in java");
    }

    private static Ex75singleton obj = null;

    public  static Ex75singleton getInstance(){
        if(obj == null){
            obj = new Ex75singleton();
        }
        return obj;
    }
}
