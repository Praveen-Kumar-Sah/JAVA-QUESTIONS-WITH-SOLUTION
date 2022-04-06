// inteface in java we can use multiple inheritance by using interface
interface Ex85{
    abstract void makevideo();
}

abstract interface Ex86{
    abstract void study();
}

public class Ex84 implements Ex85 , Ex86{
    public static void main(String args[]){
        Ex84 e8 = new Ex84();
        e8.study();
        e8.makevideo();
    }
    @Override
    public void study(){
       System.out.println("Ex85 is reading");
    }
    @Override
    public void makevideo(){
        System.out.println("Ex86 is make videos");
    }
    
}
