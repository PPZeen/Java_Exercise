import java.util.Date;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email; 

    Person(String name, String address, String phoneNumber, String email)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void setName(String name) {this.name = name;}
    public void setAddress(String address){this.address = address;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
    public void setEmail(String email) {this.email = email;}

    public String toString()
    {
        String lineOne = "Name: " + this.name + "\n";
        String lineTwo = "Address: " + this.address + "\n";
        String lineThree = "Phone: " + this.phoneNumber + "\n";
        String lineFour = "Email: " + this.email + "\n";

        return lineOne + lineTwo + lineThree + lineFour;
    }
}

class Student extends Person
{
    public enum Status
    {
        FRESHMAN,SOPHOMORE,JUNIOR,SENIOR;
    }
    Status status;

    Student(String name, String address, String phoneNumber, String email)
    {
        super(name, address, phoneNumber, email);
    }
    void setStatus(int s)
    {
        if(s == 1) {status = status.FRESHMAN;}
        else if(s == 2) {status = status.SOPHOMORE;}
        else if(s == 3) {status = status.JUNIOR;}
        else {status = status.SENIOR;}
    }
    public String toString()
    {
        return "Student\n" + super.toString() + "Status: " + this.status;
    }
}

class Employee extends Person
{
    private String office;
    private double salary;
    private Date dateHired;

    Employee(String name, String address, String phoneNumber, String email)
    {
        super(name, address, phoneNumber, email);
        this.office = "Office";
        this.salary = 9000;
        this.dateHired = new Date();
    }
    Employee(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired)
    {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    void setOffice(String office)
    {
        this.office = office;
    }
    void setSalary(double salary)
    {
        this.salary = salary;
    }
    void setDateHired(Date dateHiDate)
    {
        this.dateHired = dateHiDate;
    }
    public String toString()
    {
        String lineOne = "Office: " + this.office + "\n";
        String lineTwo = "Salary: " + this.salary + "\n";
        String lineThree = "Date Hired: " + this.dateHired + "\n";

        return "Employee\n" + super.toString() + lineOne + lineTwo + lineThree;
    }
}

class Faculty extends Employee
{
    private String officeHours;
    private int rank;

    Faculty(String name, String address, String phoneNumber, String email)
    {
        super(name, address, phoneNumber, email);
    }
    Faculty(String name, String address, String phoneNumber, String email, String officeHours, String office, double salary, Date dateHired, int rank)
    {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public void setOfficeHours(String officeHours)
    {
        this.officeHours = officeHours;
    }
    public void setRank(int rank)
    {
        this.rank = rank;
    }
    public String toString()
    {
        return "Faculty\n" + super.toString() + "OfficeHours: " + this.officeHours + "\n" + "Rank: " + this.rank;
    }
}

class Staff extends Employee
{
    private String title;
    
    Staff(String name, String address, String phoneNumber, String email)
    {
        super(name, address, phoneNumber, email);
    }
    Staff(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired, String title)
    {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }
    Staff(String name, String address, String phoneNumber, String email, String title)
    {
        super(name, address, phoneNumber, email);
        this.title = title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String toString()
    {
        return "Staff\n" + super.toString() + "Title: " + this.title;
    }
}
