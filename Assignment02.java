import Package1.ClassA;
import Package2.ClassB;


public class Assignment02 {
    public static void main(String[] args) {
        System.out.println("This text is just for example");

        // Package 1
        ClassA package1 = new ClassA();
        package1.printMessage();

        // Package 2
        ClassB classB = new ClassB();
        classB.printMessage();
    }
}
