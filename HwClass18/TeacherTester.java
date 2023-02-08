package HwClass18;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        teacher1.name="Valentin";
        teacher1.teacherId=128624;
        teacher1.subject="class";
        teacher1.communicate();
        teacher1.encurage();
        teacher1.motivate();
        teacher1.patient();
        System.out.println("*******************************");

        MathTeacher mathTeacher1=new MathTeacher();
        mathTeacher1.name="Carry";
        mathTeacher1.teacherId=933651;
        mathTeacher1.subject="math";
        mathTeacher1.solution="solution";
        mathTeacher1.communicate();
        mathTeacher1.encurage();
        mathTeacher1.motivate();
        mathTeacher1.patient();

        System.out.println("******************************");

        ChemistryTeacher chemistryTeacher1=new ChemistryTeacher();
        chemistryTeacher1.name="Eli";
        chemistryTeacher1.teacherId=188901;
        chemistryTeacher1.subject="chemistry";
        chemistryTeacher1.communicate();
        chemistryTeacher1.encurage();
        chemistryTeacher1.motivate();
        chemistryTeacher1.patient();
        System.out.println("******************************");


        PianoTeacher pianoTeacher1=new PianoTeacher();
        pianoTeacher1.name="Uma";
        pianoTeacher1.teacherId=921884;
        pianoTeacher1.subject="piano";
        pianoTeacher1.communicate();
        pianoTeacher1.encurage();
        pianoTeacher1.motivate();
        pianoTeacher1.patient();

    }
}
