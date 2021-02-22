package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Challenge;
import academy.learnprogramming.kotlincode.Employee;
import academy.learnprogramming.kotlincode.KotlinCodeKt;
//import academy.learnprogramming.kotlincode.KotlinStuff; //solution #1

public class Main {

    public static void main(String[] args) {

        /*Task #1
        KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);
        employee.takesDefault("arg1");*/

        //Task #2
        KotlinCodeKt.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);
        //employee.takesDefault("arg1");

        //employee.takesDefault(null); //NullPointerException: paremeter specified as non-null.
    }
}
