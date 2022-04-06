// pair class of Ex93 with integer and string
public class Ex94 <X , Y> {
    X x;
    Y y;

    public Ex94(X x, Y y){
        this.x=x;
        this.y=y;
    }

    public void getDescription(){
        System.out.println(x+ " and "+y);
    }
    
}
