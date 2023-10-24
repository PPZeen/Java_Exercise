import java.util.Scanner;

public class testTriangleObject {
    public static void main(String args[]) {
        System.out.print("Enter side-A of Triangle: ");
        Scanner input = new Scanner(System.in);
        double sideA = input.nextDouble();

        System.out.print("Enter side-B of Triangle: ");
        input = new Scanner(System.in);
        double sideB = input.nextDouble();

        System.out.print("Enter side-C of Triangle: ");
        input = new Scanner(System.in);
        double sideC = input.nextDouble();

        System.out.print("Enter color of Triangle: ");
        input = new Scanner(System.in);
        String color = input.nextLine();

        System.out.print("Enter filled of Triangle: ");
        input = new Scanner(System.in);
        boolean fiiled = input.nextBoolean();


        GeomericObject object1 = new Triangle(sideA, sideB, sideC, color, fiiled);
        System.out.println("-------------------------------");
        System.out.println(object1.toString());
    }
}
