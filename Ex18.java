public class Ex18 {
    public static void main(String args[]){
        int rating = 2;
        switch(rating){
            case 1:
            case 2:
            System.out.println("Bad review");
            break;
            case 3:
            System.out.println("Average review");
            break;
            case 4:
            case 5:
            System.out.println("Good review");
            break;
        }
    }
}
