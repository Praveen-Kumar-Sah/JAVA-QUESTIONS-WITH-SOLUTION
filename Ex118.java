// Hash code and Equals in java
public class Ex118 {
    public static void main(String[] args) {
        
        Ex119 p1 = new Ex119(10,"red");
        Ex119 p2 = new Ex119(10,"red");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));
    }
}

class Ex119{
    int price;
    String color;

     public Ex119(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ex119 other = (Ex119) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + price;
        return result;
    }
}
