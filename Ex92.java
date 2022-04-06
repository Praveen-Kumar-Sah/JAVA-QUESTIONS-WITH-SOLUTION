import java.util.*;

// java collection framework
// list , sets, queue and map interface
// Arraylist in java
public class Ex92{
    public static void main(String args[]){
       
        // here <String> is generic type
        ArrayList<String> fruits = new ArrayList<String>();
        List<String> vagetable = new ArrayList<String>();
       
        // add function
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println(fruits);

        vagetable.add("patato");
        vagetable.add("tomato");
        vagetable.add("onion");
         
        System.out.println(vagetable);
        
        // addall function
        fruits.addAll(vagetable);

        System.out.println(fruits);

        //get function
        System.out.println(fruits.get(4));

        // set function
        fruits.set(2, "chilli");
        System.out.println(fruits);

        //remove function
        fruits.remove(3);
        System.out.println(fruits);

        // toRemove function
        List<String> toRemove = new ArrayList<String>();
        toRemove.add("Apple");
        fruits.removeAll(toRemove);
        System.out.println(fruits);

        // size function
        System.out.println(fruits.size());
        
        // contains
        System.out.println(fruits.contains("Mango"));

        // isEmpty function
        System.out.println(fruits.isEmpty());

        // toArray function
        String temp[]  = new String[fruits.size()];
        fruits.toArray(temp);
        for(String s : temp){
            System.out.println(s);
        }

        // clear function
        fruits.clear();
        System.out.println(fruits);
    }

}