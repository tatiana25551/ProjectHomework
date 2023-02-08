package HwClass18;

public class A2 {
    String dog;
    String breed;
    void dogBreed(){
        System.out.println("My dog is shepard");
    }
}
class B2 extends A2{
    String name;
    void  dogName(){
        System.out.println("His name is Rocky");
    }
}
class C2 extends B2{
    int age;
    void dogAge(){
        System.out.println("Rocky is 4");
    }
}