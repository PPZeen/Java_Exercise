public class testTriangleWithException {
    public static void main(String[] args) {
        try {
            Triangle object1 = new Triangle(5, 4, 3);
            Triangle object2 = new Triangle(5, -13, 7);
            Triangle object3 = new Triangle(12, 13, 5);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of Object Created: "+ Triangle.getNumberOfObjects());
    }
}