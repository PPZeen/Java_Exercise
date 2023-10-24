import java.lang.Math;

public class RegularPolygon {
    private int n = 3;
    private double x = 0;
    private double y = 0;
    private double side  = 1;

    RegularPolygon(){}
    RegularPolygon(int n, double side)
    {   
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n, double side, double x, double y)
    {   
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    double getN(){return n;}
    double getSide(){return side;}
    double getX(){return x;}
    double getY(){return y;}

    void setN(int n){this.n = n;}
    void setSide(double side){this.side = side;}
    void setX(double x){this.x = x;}
    void setY(double y){this.y = y;}

    double getPerimeter()
    {
        return n*side;
    }
    double getArea()
    {
        return (n * Math.pow(side,2)/(4*Math.tan(Math.PI/n)));
    }
    void getData()
    {
        System.out.println("n = " + n);
        System.out.println("size = " + side);
        System.out.println("x-coordinate = " + x);
        System.out.println("y-coordinate = " + y);
    }
}
