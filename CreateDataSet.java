import java.util.Random;

public class CreateDataSet {
    public static void main(String args[]) throws Exception {
        java.io.File file = new java.io.File("Salary.txt");
        if(file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
            for(int i = 1; i <= 1000; i++) {
                output.print("FirstName" + Integer.toString(i) + "\t" + "LastName"+ Integer.toString(i) + "\t");
                if(i == 1000)
                    output.print(randomData());
                else
                    output.println(randomData());
            }
        }
    }
    public static String randomData() {
        String rank[] = {"assistant", "associate", "full"};
        int index = new Random().nextInt(rank.length);
        String data = rank[index] + "\t\t" + assistantSalary();

        if (index == 1) {
            data = rank[index] + "\t\t" + associateSalary();
        }
        else if (index == 2) {
            data = rank[index] + "\t\t" + fullSalary();
        }
        return data;
    }
    public static String assistantSalary() {
        return String.format("%.2f", randomRange(50000, 80000));
    }
    public static String associateSalary() {
        return String.format("%.2f", randomRange(60000, 110000));
    }
    public static String fullSalary() {
        return String.format("%.2f", randomRange(75000, 130000));
    }
    public static double randomRange(double min, double max) {
        return (double)(Math.random() * (max - min + 1)) + min;
    }
}