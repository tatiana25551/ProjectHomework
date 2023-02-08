package HwClass19;
/*2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!*/
public class Employee {

    String name;
    String occupation;
    int salary;

    Employee(String name,String occupation,int salary){
        this.name=name;
        this.occupation=occupation;
        this.salary=salary;
    }
 void printInfo(){
        System.out.println("Employee "+name+ " is "+occupation+ " and earns "+salary+ " per year ");
    }
}
  class FullTime extends Employee{
        int years;
      FullTime(String name, String occupation, int salary,int years ) {
          super(name, occupation,salary);
          this.years=years;
      }
      void printYears(){
          System.out.println("Employee works full time: " +years);
  }
  }

  class PartTime extends Employee {
    String employeeId;

      PartTime(String name, String occupation, int salary,String employeeId) {
          super(name, occupation, salary);
          this.employeeId=employeeId;
      }
      void printemployeeId(){
          System.out.println("Employee ID "+employeeId);
      }
  }


  class TesterSubclass extends FullTime{
    int taxes;

      TesterSubclass(String name, String occupation, int salary, int years) {
          super(name, occupation, salary,years);
          this.taxes=taxes;
      }
      void printTaxes(){
          System.out.println("Employee pays big taxes "+taxes);
      }
  }

  class Main{
    public static void main(String[]args){
      TesterSubclass tester=new TesterSubclass("Eli","engineer",189000,3);
        tester.printInfo();
        tester.printYears();
        tester.printTaxes();


    }
  }
