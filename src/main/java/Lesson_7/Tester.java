package Lesson_7;

import Lesson_7.annotation.AfterSuite;
import Lesson_7.annotation.BeforeSuite;
import Lesson_7.annotation.Test;

import java.lang.reflect.Constructor;

import java.lang.reflect.Method;

/**
 * @author Dm.Petrov
 * DATE: 09.02.2022
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        Class testClazz = Class.forName("Lesson_7.Test_One");
        Class testClazz2 = Class.forName("Lesson_7.Test_Two");
        start(testClazz);
        System.out.println("---------------------");
        start(testClazz2);
    }

    public static void start(Class clazz) throws Exception {
        Constructor constructor = clazz.getConstructor();
        Object testOne = constructor.newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        Method before =null;
        Method after = null;
        for (Method m : methods
        ) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                if(before==null)
                {
                before=m;
                }
                else{ throw new RuntimeException("There should be only one method BeforeSuite");}
                m.invoke(testOne);
            }
        }

        for (int priority = 0; priority <= 3; priority++) {
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class) &&
                        (method.getAnnotation(Test.class).priority() == priority)) {
                    method.invoke(testOne);
                    break;
                }
            }
        }
        for (Method m : methods
        ) {
            if (m.isAnnotationPresent(AfterSuite.class)) {
                if(after==null)
                {
                    after=m;
                }
                else{ throw new RuntimeException("There should be only one method AfterSuite");}
                m.invoke(testOne);
            }
        }
    }
}