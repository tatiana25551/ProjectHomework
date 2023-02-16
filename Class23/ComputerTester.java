package Class23;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] comp={new Apple(),new Lenovo(),new HP(),new Dell()};
        for(Computer computer:comp){
            computer.turnOn();
            computer.playMusic();
            computer.wifi();
            computer.turnOff();
        }

    }
}
