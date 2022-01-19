package Lesson_1;

import java.util.ArrayList;

/**
 * @author Dm.Petrov
 * DATE: 19.01.2022
 */
public class Box<T extends Fruit> {
    ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T a) {
        list.add(a);
    }

    public ArrayList<T> getList() {
        return list;
    }

    public float getBoxWeight() {
        if (!getList().isEmpty()) {
            return getList().size() * getList().get(0).getWeight();
        }
        return 0;
    }


    public boolean compareTo(Box o) {
        return this.getBoxWeight() == o.getBoxWeight();
    }

    public void shiftFruit(Box<T> box) {
        box.getList().addAll(this.getList());
        this.getList().clear();

    }


}
