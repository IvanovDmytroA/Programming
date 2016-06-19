package ua.org.oa.ivanovd.homework7.deadlock;

/**
 * Created by Администратор on 19.06.2016.
 */
public class App {

    public static void main(String[] args) {
        Human human1 = new Human("Dima", new Car("Ford", 2010));
        Human human2 = new Human("Sasha", new Car("Ford", 2011));

        human1.setFriend(human2);
        human2.setFriend(human1);

        human1.start();
        human2.start();
    }
}
