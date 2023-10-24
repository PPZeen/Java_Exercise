class Rectangle extends GeomericObject 
                implements ComparableRectangle<Rectangle>{
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
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
    public int compareTo(Rectangle object) {
        if(getArea() == object.getArea()) {
            return 1;
        }
        return 0;
    }
}