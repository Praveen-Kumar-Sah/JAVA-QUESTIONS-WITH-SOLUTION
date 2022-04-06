import java.util.*;

// from class Ex121
public class Ex122 {
    public static void main(String[] args) {

        List<Ex121> st = new ArrayList<>();

        st.add(new Ex121(20,"Praveen"));
        st.add(new Ex121(21,"Raushan"));
        st.add(new Ex121(22,"Jay"));
        st.add(new Ex121(25,"Harendra"));
        st.add(new Ex121(23,"Ravi"));
        st.add(new Ex121(23,"Rahul"));

        // Collections.sort
        st.forEach(System.out::println); // by lambda function
    }
}

class Ex123 implements Comparator<Ex121>{

    @Override
    public int compare(Ex121 o1, Ex121 o2) {
        if(o1.name.equals(o2.name)){
            return o1.marks - o2.marks;
        }
        else{
            return o1.name.compareTo(o2.name);
        }
    }

}
