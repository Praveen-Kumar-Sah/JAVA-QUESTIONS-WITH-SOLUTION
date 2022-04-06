// selection shorting in java
public class Ex50 {
    public static void main(String args[]){

        int a[] = {3,1,-2,7,4,11,-3,-5,9};
        int n = a.length;
        
        for(int i=0; i<n-1; i++){
            int mind = i;

            for(int j=i; j<n; j++){
                
                if(a[j] < a[mind]){
                    mind = j;
                }
            }

            int temp = a[i];
            a[i] = a[mind];
            a[mind] = temp;
        }

        for(int e:  a){
            System.out.print(e+" ");
        }
    }
    
}
