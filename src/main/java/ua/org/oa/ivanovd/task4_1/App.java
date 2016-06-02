package ua.org.oa.ivanovd.task4_1;

import java.util.Arrays;

/**
 * Created by Администратор on 02.06.2016.
 */
public class App {


    public static void main(String[] args) {
        Integer[] masInteger = {25, 17, -50, 34, 156};
        String[] masString = {"Far", "Close", "Stop", "Port", "Step"};
        Auto[] masAuto = {new Auto("Audi", 2013), new Auto("Mazda", 2015), new Auto("Nissan", 2014)};
        Computer[] masComputer = {new Computer(2014, 2.4), new Computer(2015, 3.1), new Computer(2016, 3.1), new Computer(2013, 2.5)};
        App.getMaxElement(masInteger);
        App.getMaxElement(masString);
        App.getMaxElement(masComputer);
        //  App.getMaxElement(masAuto);
    }

    public static<T extends Comparable<T>> void getMaxElement(T[] array) {
        Arrays.sort(array, (T o1, T o2) -> {
            return (o1.compareTo(o2));
        });
        System.out.println("sorted array: " + Arrays.asList(array));
        System.out.println("max element = " + array[array.length-1] + '\n');
    }

}
