package Class23;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
      //  Define common behavior within and some fields in parent class and override some of the methods in child classes
      //  Define some methods specific to child classes
     //   Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class Computer {
    public void turnOn(){
        System.out.println("Device is on");
}
    public void playMusic (){
        System.out.println("Music is on ...");
    }
    public void wifi() {
        System.out.println("Computers has wifi connection");

    }
    public void turnOff(){
        System.out.println("Device is off");
    }

}
class Apple extends Computer{

    @Override
    public void turnOn() {
        System.out.println("Turning on Macbook");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is played thru Itunes");
    }

    @Override
    public void wifi() {
        System.out.println("Apple computer has wifi connection");

    }
    @Override
    public void turnOff() {
        System.out.println("Macbook is off");
    }
}
class Lenovo extends Computer {
    @Override
    public void turnOn() {
        System.out.println("Lenovo computer is on");
    }

    @Override
    public void playMusic() {
        super.playMusic();
    }

    @Override
    public void wifi() {
        System.out.println("Lenovo computer has wifi connection");
    }

    @Override
    public void turnOff() {
        System.out.println("Lenovo computer is off");
    }
}
   class HP extends Computer{
       @Override
       public void turnOn() {
           System.out.println("HP computer is on");
       }

       @Override
       public void playMusic() {

       }

       @Override
       public void wifi() {
           System.out.println("HP computer has wifi connection");
       }

       @Override
       public void turnOff() {
           System.out.println("HP computer is off");
       }
   }
class Dell extends Computer{
    @Override
    public void turnOn() {
        System.out.println("Dell computer is on");
    }

    @Override
    public void playMusic() {
        super.playMusic();
    }

    @Override
    public void wifi() {
        System.out.println("Dell computer has wifi connection");
    }

    @Override
    public void turnOff() {
        System.out.println("Dell computer is off");

    }
}
