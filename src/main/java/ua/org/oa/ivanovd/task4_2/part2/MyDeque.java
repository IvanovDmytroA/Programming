package ua.org.oa.ivanovd.task4_2.part2;

/**
 * Created by Администратор on 02.06.2016.
 */
public interface MyDeque<E> extends Iterable<E> {
    // Добавить элемент в начало списка
    void addFirst(E e);

    // Добавить элемент в конец списка
    void addLast(E e);

    // Получить элемент из начала списка и удалить его
    E removeFirst();

    // Получить элемент из конца списка и удалить его
    E removeLast();

    // Получить элемент из начала списка, не удаляя его
    E getFirst();

    // Получить элемент из конца списка, не удаляя его
    E getLast();

    // Проверить, содержится ли объект o в списке(с помощью equals)
    boolean contains(Object o);

    // Очистить список
    void clear();

    // Вернуть массив элементов из списка(сохраняя упорядоченность элементов списка)
    Object[] toArray();

    // Вернуть количество элементов в списке
    int size();

    // Проверить, содержит ли список все элементы списка deque
    boolean containsAll(MyDeque<? extends E> deque);
}
