import java.util.Date;
import java.lang.Math;

public class Triangle extends GeomericObject{
    private double sideA;
    private double sideB;
    private double sideC;
    private static int numberOfObjects = 0;

    public Triangle() {
        super();
        setSide(sideA, sideB, sideC);
        numberOfObjects++;
    }
    public Triangle(double sideA, double sideB, double sideC){
        super();
        setSide(sideA, sideB, sideC);
        numberOfObjects++;
    }
    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled){
        super(color, filled);
        setSide(sideA, sideB, sideC);
        numberOfObjects++;
    }

    public void setSide(double side1, double side2, double side3) throws IllegalArgumentException {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.sideA = side1;
            this.sideB = side2;
            this.sideC = side3;
        }
        else {
            throw new IllegalArgumentException("Any two sides needs to be grater than the other side");}
    }

    public String getColor() {
        return super.getColor();
    }
    public boolean isFilled() {
        return super.isFilled();
    }
    public Date getDateCreate() {
        return super.getDateCreate();
    }
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public void setColor(String color) {
        super.setColor(color);
    }
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public double getArea() {
        double s = (sideA + sideB + sideC)/2;
        double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return Math.round(area*100.00)/100.00;
    }
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    public String toString()
    {
        String text = "Area: " + getArea() + " unit square\nPerimeter: " + getPerimeter()
                    + " unit";
        return super.toString() + text;
    }
}
class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super( "The sum of any two sides is greater than the other side.");
    }
}