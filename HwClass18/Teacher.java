package HwClass18;

//Write a Java program called Teacher.Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes

public class Teacher {
    String name;
    int teacherId;
    String subject;

    public void encurage(){
        System.out.println("A good teacher always encourage");
    }
    public void patient(){
        System.out.println("Teacher are patient");
    }
    public void motivate(){
        System.out.println("Teacher motivate their students");
    }
    public void communicate(){
        System.out.println("Teacher communicate with students");
    }
}
 class MathTeacher extends Teacher{
    String solution;

    void teachermath(){
        System.out.println("Teacher realises solutions");
    }
 }
 class ChemistryTeacher extends Teacher{
    String experiment;
        void teacherchemistry(){
            System.out.println("Teacher shows experiment");
    }
        }
        class PianoTeacher extends Teacher{
        String melody;
        void teacherpiano(){
            System.out.println("Teacher plays beautiful melody");
        }

        }