public class Course {
    private String courseName;
    private String[] students = {};
    private int numberOfStudents = 0;

    Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {   
        numberOfStudents += 1;
        String studentsW[] = new String[numberOfStudents];

        System.arraycopy(students, 0, studentsW, 0, students.length);
        studentsW[numberOfStudents-1] = student;
        
        students = new String[numberOfStudents];
        System.arraycopy(studentsW, 0, students, 0, numberOfStudents);
    }
    public void dropStudent(String student)
    {
        int index = 0;

        for(int i = 0; i < students.length; i++)
        {
            if(students[i] == student)
            {
                index = i; break;
            }
        }

        numberOfStudents -= 1;
        String studentsW[] = new String[numberOfStudents];

        System.arraycopy(students, 0, studentsW, 0, index);
        System.arraycopy(students, index+1, studentsW, index, numberOfStudents-index);
        
        students = new String[numberOfStudents];
        System.arraycopy(studentsW, 0, students, 0, numberOfStudents);
    }
    public void clear()
    {
        numberOfStudents = 0;
        students = new String[0];
    }

    public String getCourseName()
    {
        return courseName;
    }
    public String[] getStudent()
    {
        return students;
    }
    public int getNumberOfStudents()
    {
        return numberOfStudents; 
    }
}
