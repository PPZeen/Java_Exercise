import java.util.Scanner;

public class testTax {
    public static void main(String arge[])
    {
        int[][] brackets = {{8350, 33950, 82250, 171550, 372950},  // Single filer
                        {16700, 67900, 137050, 20885, 372950}, // Married jointly// -or qualifying widow(er)
                        {8350, 33950, 68525, 104425, 186475},  // Married separately
                        {11950, 45500, 117450, 190200, 372950} // Head of household
                        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        System.out.println("Filling Status");
        System.out.println("    [0] -Single filer");
        System.out.println("    [1] -Married jointly or qualifying widow(er)");
        System.out.println("    [2] -Married separately");
        System.out.println("    [3] -Head of household");

        System.out.print("Enter the filing status: ");
        Scanner input = new Scanner(System.in);
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        input = new Scanner(System.in);
        int income = input.nextInt();

        Tax t1 = new Tax(status, brackets, rates, income);
        System.out.println("Tax is: " + t1.getTax());
    }
}
