import java.lang.Cloneable;

public class Octagon extends GeomericObject implements ComparableOctagon<Octagon>, Cloneable{
    private double side;

    public Octagon() {
        super();
        this.side = 1;
    }
    public Octagon(double side) {
        super();
        this.side = side;
    }
    public Octagon(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return (2 + (4/22))*side*side;
    }
    public double getPerimeter() {
        return side*8;
    }
    public String toString() {
        String text = "Area: " + getArea() + " unit square\nPerimeter: " + getPerimeter()
                    + " unit";
        return super.toString() + text;
    }
    public int compareTo(Octagon object) {
        if(getArea() == object.getArea()) {
            return 1;
        }
        return 0;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
