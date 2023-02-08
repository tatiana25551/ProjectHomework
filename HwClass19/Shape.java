package HwClass19;
//1. Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
//In circle class create a method to calculate the area of circle. Test your code
public class Shape {
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape {

    double pi=3.14;
    double area=pi *(radius*radius);
    Circle(double radius){
        super(radius);
    }
    void printResult(){
        System.out.println("The area of the circle is "+area);
    }



    public static void main(String[] args) {
        Circle circle=new Circle(7.5);
        circle.printResult();

    }

}
