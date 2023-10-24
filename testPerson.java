import java.util.Date;

public class testPerson {
    public static void main(String args[])
    {
        Person person = new Person("Woot", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "061-123-8350", "woot@gmail.com");
        System.out.print(person.toString());
        System.out.println("-------------------------------------");

        Student student = new Student("Tutor", "2 Chalongkrung Road, Ladkrabang, BKK, 10520", "061-456-8350", "tutor@gmail.com");
        student.setStatus(1);
        System.out.println(student.toString());
        System.out.println("-------------------------------------");

        Date date = new Date();
        Employee employee = new Employee("Go", "3 Chalongkrung Road, Ladkrabang, BKK, 10520", "061-789-8350", "go@gmail.com", "PAPA", 15000, date);
        System.out.println(employee.toString());
        System.out.println("-------------------------------------");

        Faculty faculty = new Faculty("Zen", "4 Chalongkrung Road, Ladkrabang, BKK, 10520", "081-123-4567", "zen@gmail.com", "10 am. - 7 pm.", "MAMA", 15000, date, 2);
        System.out.println(faculty.toString());
        System.out.println("-------------------------------------");

        Staff staff = new Staff("Zeen", "5 Chalongkrung Road, Ladkrabang, BKK, 10520", "091-123-4567", "zeen@gmail.com", "KAKA", 15000, date, "title");
        System.out.println(staff.toString());
        System.out.println("-------------------------------------");
    }
}
