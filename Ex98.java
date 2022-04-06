// use own lincked list which you created in Ex97
// import java.util.*;
public class Ex98 {
    public static void main(String args[]){

        Ex97 myll = new Ex97();

        myll.add(12);
        myll.add(56);

        for(int i=0; i<10; i++){
            myll.add(i);
        }
        myll.print();
    }
}
