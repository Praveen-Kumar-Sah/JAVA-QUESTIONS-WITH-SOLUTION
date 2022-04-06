// string in java
public class Ex51 {
    public static void main(String args[]){
        String name = "praveen";
        String aname = "Praveen";
        String another = new String("prithvi");
        
        System.out.println(name);
        System.out.println(another);
        System.out.println(name == another);
        System.out.println(name == aname);

        name="sah";
        System.out.println(name);

        System.out.println(aname.charAt(6));
        System.out.println(aname.length());
        System.out.println(aname.substring(2));
        System.out.println(aname.substring(2, 5));
        System.out.println(aname.contains("praveen"));
        System.out.println(aname.equals(another));

        System.out.println(aname.isEmpty());
        System.out.println(aname + name);
        System.out.println(aname.concat(name));
        System.out.println(aname.replace('p', 'D'));

        String cars = "Hyunda,Maruti,Ford,BMW";
        String allcar[] = cars.split(",");
        for(String car : allcar){
            System.out.println(car);
        }

        System.out.println(aname.indexOf('v'));
        System.out.println(aname.toLowerCase());
        System.out.println(aname.toUpperCase());

        String lname = "           kumar          ";
        System.out.println(lname.trim());
    }
    
}
