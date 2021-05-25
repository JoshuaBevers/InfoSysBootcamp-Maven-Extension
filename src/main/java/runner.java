import arrays.arraylooping;
import classes.book;
import fizzbuzz.buzzy;
import oop.Employee;
import oop.abstraction.abRunner;
import oop.bird;
import oop.duck;
import calculator.calculatorRunner;

public class runner {

    public static void main(String[] args) {
        //fizzbuzz
        // system.out.println(buzzy.fizzybuzz()); runs fuzzbuzz

        //array loop
        // arraylooping.arrayloops();

        //classes
        // book George = new book("GeorgeSmash!", true, "Moon Speak", "Philosophy");
        // System.out.println(George.getName());

        // oop
        // bird exampBird = new bird("hawk", false, 1, true, "Some", 2, 3);
        // Employee James = new Employee("James", 20, "Annoying", 52);
        // System.out.println(James.calculateWeeklySalary());

        // oop.abstraction Here we begin new runner format to truncate code in the main runner.
        //        abRunner.RUNNER();
        calculatorRunner.RUNNER();

    }
}

