// using own stack and vector
public class Ex102 {
    public static void main(String args[])throws Exception{
        Ex101<Integer> stk = new Ex101<>();

        stk.push(22);
        stk.push(45);
        stk.push(99);
        System.out.println(stk);

        int pp = stk.pop();
        System.out.println(pp);

        int pk = stk.peek();
        System.out.println(pk);
    }
    
}
