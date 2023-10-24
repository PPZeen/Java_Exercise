import java.util.Date;

public abstract class GeomericObject {
    private String color;
    private boolean filled;
    private Date dateCreate;

    protected GeomericObject(){
        this.dateCreate = new Date();
    }
    protected GeomericObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreate = new Date();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreate(){
        return this.dateCreate;
    }
    public String toString()
    {
        return "Create on " + this.dateCreate + "\nColor: " + this.color
                + "\nFilled: " + this.filled + "\n";
    }
    public abstract double getArea();

    public abstract double getPerimeter();
}
