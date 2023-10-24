import java.text.DecimalFormat;
import java.util.Scanner;

public class ProcessData {
    public static void main(String args[]) throws Exception {
        java.io.File file = new java.io.File("Salary.txt");
        Scanner input = new Scanner(file);

        int count = 0;
        int countFull = 0;
        int countAssistant = 0;
        int countAssociate = 0;
        double totalSalaryFull = 0;
        double totalSalaryAssistant = 0;
        double totalSalaryAssociate  = 0;
        
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            String rank = input.next();
            double salary = input.nextDouble();

            if(rank.equals("full")){
                totalSalaryFull += salary;
                countFull++;
            }
            else if(rank.equals("assistant")) {
                totalSalaryAssistant += salary;
                countAssistant++;
            }
            else {
                totalSalaryAssociate += salary;
                countAssociate++;
            }
            count++;
        }
        input.close();
        double totalSalary = totalSalaryAssistant + totalSalaryAssociate + totalSalaryFull;
        DecimalFormat df = new DecimalFormat("###,###,###.##");

        System.out.println("Total salary for assistant professor is " + df.format(totalSalaryAssistant));
        System.out.println("Total salary for associate professor is " + df.format(totalSalaryAssociate));
        System.out.println("Total salary for full professor is " + df.format(totalSalaryFull));
        System.out.println("Total salary for all professors is " + df.format(totalSalary));
        System.out.println("Average salary for assistant professor is " + df.format(totalSalaryAssistant/countAssistant));
        System.out.println("Average salary for associate professor is " + df.format(totalSalaryAssociate/countAssociate));
        System.out.println("Average salary for full professor is " + df.format(totalSalaryFull/countFull));
        System.out.print("Average salary for all professors is " + df.format(totalSalary/count));
    }   
}