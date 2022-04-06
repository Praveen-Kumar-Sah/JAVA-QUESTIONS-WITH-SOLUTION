// calculate power using recursion
public class Ex125 {

    static int stepCount = 0;
    public static void main(String[] args) {
        System.out.println(pow(3,10000));
        System.out.println("steps " + stepCount);

        stepCount=0;
        System.out.println(fastPow(3, 10000));
        System.out.println("step " + stepCount);

        System.out.println(path(4, 4));
    }

    static int pow(int a, int b){
        stepCount++ ;
        if(b==0){
            return 1;
        }
        return a * pow(a, b-1);
    }

    static int fastPow(int a , int b){
        System.out.println(b);
        stepCount++;
        if(b == 0 ){
            return 1;
        }
        if(b%2 == 0){
            return fastPow(a*a, b/2);
        }
        return a*fastPow(a, b-1);
    }

    static int path(int n, int m){
        if(n == 1 || m==1) return 1;
        return path(n, m-1) + path(m , n-1);
    }
    
}
