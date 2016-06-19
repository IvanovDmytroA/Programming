package ua.org.oa.ivanovd.homework7.deadlock;

/**
 * Created by Администратор on 19.06.2016.
 */
public class Human extends Thread{

    private String name;
    private Car car;
    private Human friend;

    public Human getFriend() {
        return friend;
    }

    public void setFriend(Human friend) {
        this.friend = friend;
    }

    public Human(String name, Car car){
        setName(name);
        setCar(car);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.goToFriend(friend);
    }

}
