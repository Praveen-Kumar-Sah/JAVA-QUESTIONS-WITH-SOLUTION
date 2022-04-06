import java.util.*;

// Vector and Stack in java
public class Ex100 {
    public static void main(String args[]){
        // vector data-structurte
        Vector <Integer> vc = new Vector<>();

        vc.add(12);
        vc.add(23);
        vc.add(34);
        vc.add(65);
        System.out.println(vc);

        // stack data structure,  last in first out

        Stack<Integer> stk = new Stack<>();
        stk.push(12);
        stk.push(56);
        stk.push(67);
        stk.push(98);
        System.out.println(stk);

        int pp=stk.pop();
        System.out.println(pp);
        System.out.println(stk);

        int pk=stk.peek();
        System.out.println(pk);
        System.out.println(stk);
    }  
}
