package Lesson_7;

import Lesson_7.annotation.AfterSuite;
import Lesson_7.annotation.BeforeSuite;
import Lesson_7.annotation.Test;

/**
 * @author Dm.Petrov
 * DATE: 12.02.2022
 */
public class Test_Two {
    @BeforeSuite
    public void printStart() {
        System.out.println("This is method beforeSuite !");
    }

    @Test(priority = 2)
    public void testOne() {
        System.out.println("Test one at Test_Two run");
    }

    @Test()
    public void testTwo() {
        System.out.println("Test two at Test_Two run");
    }

    @Test(priority = 1)
    public void priorityTest() {
        System.out.println("Run priority Test at Test_Two");
    }

    @AfterSuite
    public void finish() {
        System.out.println("This is method afterSuite");
    }

    @BeforeSuite
    public void printStart2() {
        System.out.println("This is method beforeSuite !");
    }

}
