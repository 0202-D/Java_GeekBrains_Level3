package Lesson_1;


import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Dm.Petrov
 * DATE: 17.01.2022
 */
public class Main {
    public static void main(String[] args) {


    }

    public static <T> T[] changePosition(T[] arr, int position1, int position2) {
        T var;
        var = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = var;
        return arr;
    }

    public static <T> ArrayList<T> asList(T[] a) {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(Arrays.asList(a));
        return result;
    }
}
