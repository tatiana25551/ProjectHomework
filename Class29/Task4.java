package Class29;



import java.util.HashSet;
import java.util.Set;

//Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.
public class Task4 {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();

        Student s1 = new Student("Eli",18258);
        Student s2 = new Student("Tanya",141796);
        Student s3 = new Student("Max",523149);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student s : students) {
            System.out.println(s.name);
        }

    }
}

