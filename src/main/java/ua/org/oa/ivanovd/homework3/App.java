package ua.org.oa.ivanovd.homework3;

import java.util.Arrays;

/**
 * Created by Администратор on 02.06.2016.
 */
public class App {
    public static void main(String[] args) {

        GenericStorage<String> genericStorage = new GenericStorage<>(5);
        genericStorage.add("Volvo");
        genericStorage.add("Dodge");
        genericStorage.add("Ferrari");
        genericStorage.add("Mazda");
        genericStorage.add("Audi");
        System.out.println();
        System.out.println(genericStorage.get(1));
        System.out.println();
        System.out.println("Текущий массив: " + Arrays.toString(genericStorage.getAll()));
        System.out.println();
        genericStorage.update(2, "Nissan");
        System.out.println("Текущий массив: " + Arrays.toString(genericStorage.getAll()));
        System.out.println();
        genericStorage.delete(1);
        System.out.println("Удаление элемента по индексу");
        System.out.println("Текущий массив: " + Arrays.toString(genericStorage.getAll()));
        System.out.println();
        System.out.println("Удаление заданного объекта");
        genericStorage.delete("Mazda");
        System.out.println("Текущий массив: " + Arrays.toString(genericStorage.getAll()));
        System.out.println();
        System.out.println(genericStorage.getSize());
    }

}
