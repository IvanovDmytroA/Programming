package ua.org.oa.ivanovd.task4_2.part3;

import java.util.Iterator;

/**
 * Created by Администратор on 02.06.2016.
 */
public interface ListIterator<E> extends Iterator<E> {

    // Проверяет, есть ли предыдущий элемент для выборки методом previous
    boolean hasPrevious();

    // Возвращает предыдущий элемент
    E previous();

    // Заменяет элемент, который на предыдущем шаге был возвращен next/previous на данный элемент
    void set(E e);

    // Удаляет элемент, который на предыдущем шаге был возвращен next/previous
    @Override
    void remove();
}
