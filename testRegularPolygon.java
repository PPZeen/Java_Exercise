public class testRegularPolygon {
    static public void main(String args[])
    {
        RegularPolygon object1 = new RegularPolygon();
        object1.getData();
        System.out.println("Perimeter of object: " + object1.getPerimeter());
        System.out.printf("Area of object: %.2f\n",object1.getArea());
        System.out.println("------------------------------------------------------------");

        RegularPolygon object2 = new RegularPolygon(6,4);
        object2.getData();
        System.out.println("Perimeter of object: " + object2.getPerimeter());
        System.out.printf("Area of object: %.2f\n",object2.getArea());
        System.out.println("------------------------------------------------------------");

        RegularPolygon object3 = new RegularPolygon(10, 4, 5.6, 7.8);
        object3.getData();
        System.out.println("Perimeter of object: " + object3.getPerimeter());
        System.out.printf("Area of object: %.2f\n",object3.getArea());
        System.out.println("------------------------------------------------------------");
    }
}
