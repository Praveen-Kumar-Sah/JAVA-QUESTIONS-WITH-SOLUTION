//  Zero sum SubArray in java
public class Ex114{
    public static void main(String[] args) {
        
        int a[] = {2,1,3,-4,3};
        boolean faund = false;

        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=0; j<a.length; j++){
                sum = sum + a[j];
                if(sum == 0){
                    faund = true;
                    break;
                }
            }
            if(faund) break;
        }
        System.out.println("Found "+ faund);
    }
}