package Class23;

public class StudentTester {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudents(), new CollegeStudents(), new Student()};
        for (Student student : students) {
            student.attendClasses();
            student.attendClasses();
            student.listenTeacher();
        }

    }
}