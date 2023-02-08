package HwClass17;

/*2)Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
        NOTE: please use different names for instance and local variables.*/

public class Students {

     String name;
     double grade1;
     double grade2;
     double grade3;
     double AverageGrade;

     Students(String Name,double music,double math,double history ){
         name=Name;
         grade1=music;
         grade2=math;
         grade3=history;
         AverageGrade=(music+math+history)/3;
     }
         void PrintInfo(){
             System.out.println("Student name " +name+" average grade is " +AverageGrade);

         }
}
