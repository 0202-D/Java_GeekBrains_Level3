package Lesson_7;

import Lesson_7.annotation.AfterSuite;
import Lesson_7.annotation.BeforeSuite;
import Lesson_7.annotation.Test;

/**
 * @author Dm.Petrov
 * DATE: 09.02.2022
 */
public class Test_One {
    @BeforeSuite
    public void printStart() {
        System.out.println("This is method beforeSuite !");
    }

    @Test()
    public void testOne() {
        System.out.println("Test one run");
    }

    @Test(priority = 2)
    public void testTwo() {
        System.out.println("Test two run");
    }

    @Test(priority = 1)
    public void priorityTest() {
        System.out.println("Run priority Test");
    }

    @AfterSuite
    public void finish() {
        System.out.println("This is method afterSuite");
    }
}
