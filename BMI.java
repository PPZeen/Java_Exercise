public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double pound = 0.45359237;
    public static final double inches = 0.0254;

    public BMI(String name, int age, double weight, double height)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height)
    {
        this(name, 20, weight, height);
    }

    public double getBMI()
    {
        return (weight*pound)/Math.pow((height*inches),2);
    }

    public String getWeightClass()
    {
        String ans = "";
        double BMI = getBMI();

        if(BMI < 18.5) {ans = "Underweight";}
        else if(BMI < 24.9) {ans = "Normal";}
        else if(BMI < 29.9) {ans = "Overweight";}
        else {ans = "Obase";}
        
        return ans;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public double getWeight(){return weight;}
    public double getHeight(){return height;}

    public void getData()
    {
        System.out.println("name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.printf("weight: %.2f pound\n", weight);
        System.out.printf("height: %.2f inches\n", height);
        System.out.printf("BMI: %.2f\n", getBMI());
        System.out.println("weightClass: " + getWeightClass());
    }
}
