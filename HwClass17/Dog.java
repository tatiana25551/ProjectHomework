package HwClass17;

public class Dog {
     /*
    1) Write a java class that will have a constructor: one with parameters and
     second without any parameters.
    Create a separate Test class where you will execute
    both of the constructors 1 by 1.
     */

    String nameDog;
    String colorDog;
    int ageDog;

    Dog(String name, String color, int age) {

        nameDog = name;
        colorDog = color;
        ageDog = age;
    }
    Dog() {
        nameDog = "Maggy";
        colorDog = "brown";
        ageDog = 4;
    }
    void printInfo() {
        System.out.println("Name " + nameDog + " color " + colorDog + " age " + ageDog);
    }
}


