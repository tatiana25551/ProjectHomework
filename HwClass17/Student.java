package HwClass17;

public class Student {

    String name;
    int address;

    Student(String studentname,int studentaddress){

        name=studentname;
        address=studentaddress;
    }
    Student(){
        name="Tatiana";
        address=2257;
    }

    void displayInfo(){
        System.out.println(" Student name is " +name +  "  student address is "+address);
    }

}
