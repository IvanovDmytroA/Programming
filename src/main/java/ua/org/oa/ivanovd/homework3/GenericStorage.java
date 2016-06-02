package ua.org.oa.ivanovd.homework3;

import java.util.Arrays;

/**
 * Created by Администратор on 02.06.2016.
 */
public class GenericStorage<T> {
    private int index = 0;
    private int size = 0;
    private static final int ARRAY_CAPACITY = 10;
    Object[] objects;

    public GenericStorage() {
        objects = new Object[ARRAY_CAPACITY];
    }

    public GenericStorage(int size) {
        objects = new Object[size];
    }

    public void add(T obj) {
        if (index < objects.length) {
            objects[index] = obj;
            index++;
            size++;
            System.out.println("Объект " + obj + " добавлен в массив");
        } else {
            System.out.println("Объект " + obj + " не был добавлен в массив");
        }
    }


    public T get(int index) {
        if (index < 0 || index > objects.length) {
            System.out.println("Указан неверный индекс");
            return null;
        } else {
            System.out.println("Элемент под индексом " + index + ":");
            return (T) objects[index];
        }
    }

    public T[] getAll (){
        Object[] array = new Object[size];
        int i = 0;
        for (Object o : objects) {
            if (o != null){
                array[i] = o;
                i++;
            }
        }
        return (T[])array;
    }

    public void update (int index, T obj){
        if (index < 0 || index > objects.length - 1){
            System.out.println("Указан неверный индекс");
        } else {
            System.out.println("Массив обновлен");
            objects[index] = obj;
        }
    }

    public void delete (int index){
        if (index < 0 || index > objects.length){
            System.out.println("Указан неверный индекс");
        } else {
            objects[index] = null;
            size--;
        }
    }

    public void delete(T obj){
        for (int i = 0; i < objects.length; i++) {
            if (obj.equals(objects[i])){
                objects[i] = null;
                size--;
            }
        }
    }

    public int getSize(){
        System.out.println("Текущий размер массива: ");
        return size;
    }

}



