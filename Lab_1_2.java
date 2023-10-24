public class Lab_1_2{
    public static void main(String[] args)
    {
        System.out.println("the value for x and y:");
        System.out.println("3.4x + 50.2y = 44.5\n2.1x + 0.55y = 5.9");

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        
        System.out.println("x = "+ (e*d - b*f)/(a*d - b*c));
        System.out.print("y = "+ (a*f - e*c)/(a*d - b*c));
    }
}