package HwClass18;

public class A2Test {
    public static void main(String[] args){
        A2 mom=new A2();
        mom.dog="Shepard";
        mom.dogBreed();
        System.out.println(mom.dog);

        B2 daughter=new B2();
        daughter.dog="Shepard";
        daughter.name="Maggy";
        daughter.dogName();
        System.out.println(daughter.dog+ daughter.name);

        C2 grandson=new C2();
        grandson.dog="Shepard";
        grandson.name="Rocky";
        grandson.age=1;
        grandson.dogAge();
        System.out.println( grandson.dog + grandson.name+ grandson.age);





    }

}
