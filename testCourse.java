public class testCourse {
    public static void main(String arge[])
    {
        Course course2 = new Course("Security");

        course2.addStudent("A");
        course2.addStudent("B");
        course2.addStudent("C");
        course2.addStudent("D");
        course2.addStudent("E");

        for (int i = 0; i < course2.getNumberOfStudents(); i++)
        {
            System.out.println(course2.getStudent()[i]);
        }
        System.out.println("---------------------------------------------------");
        
        course2.dropStudent("B"); course2.dropStudent("D");
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
        {
            System.out.println(course2.getStudent()[i]);
        }
        System.out.println("---------------------------------------------------");
        
        course2.clear();
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
        {
            System.out.println(course2.getStudent()[i]);
        }

    }
    
}
