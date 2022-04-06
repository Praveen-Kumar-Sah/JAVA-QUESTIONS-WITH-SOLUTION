// brackets balancing using stack in java {([])}
import java.util.*;
public class Ex103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- !=0){
            String s = sc.nextLine();

            Stack<Character> stk = new Stack<>();

            boolean isBalance = true;

            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '(' || ch == '{' || ch == '['){
                    stk.push(ch);
                    continue;
                }

                if(stk.isEmpty()){
                    isBalance = false;
                    break;
                }
                
                if(ch == ')' ){
                    if(stk.peek() == '(' ){
                        stk.pop();
                    }else{ isBalance = false ; break;}
                }

                if(ch == '}' ){
                    if(stk.peek() == '{' ){
                        stk.pop();
                    }else{ isBalance = false ; break;}
                }

                if(ch == ']' ){
                    if(stk.peek() == '[' ){
                        stk.pop();
                    }else{ isBalance = false ; break;}
                }
            }

            if(!stk.isEmpty()){
                isBalance = false; 
            }
            if(isBalance){
                System.out.println("balanced");
            }else{
                System.out.println("not balanced");
            }
        }
        
        sc.close();
    }
    
}
