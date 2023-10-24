import java.util.Date;

class Square extends GeomericObject implements Colorable{
    private double width;
    private double height;

    public Square() {
        super();
        this.width = 1;
        this.height = 1;
    }
    public Square(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
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
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setColor(String color) {
        super.setColor(color);
    }
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return 2*(width + height);
    }
    public String toString() {
        String text = "Area: " + getArea() + " unit square\nPerimeter: " + getPerimeter()
                    + " unit";
        return super.toString() + text;
    }
    public void howToColor() {
        System.out.println("Color all four sides: " + getColor());
    }
}
