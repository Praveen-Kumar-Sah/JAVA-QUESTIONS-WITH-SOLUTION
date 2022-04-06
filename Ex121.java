//  Comparable and Comparator
public class  Ex121 implements Comparable<Ex121>{

    int marks;
    String name;

    public Ex121(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ex121 [marks=" + marks + ", name=" + name + "]";
    }
    
    public int getmarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }

    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
	public int compareTo(Ex121 o) {
        if(this.marks > o.marks) return -1;
        else if(this.marks < o.marks) return 1;
        
        return this.name.compareTo(o.name);
    }
}