package ua.org.oa.ivanovd.homework7.deadlock;

/**
 * Created by Администратор on 19.06.2016.
 */
public class Car {

    private String model;
    private int yearOfRelease;

    public Car(String model, int yearOfRelease) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public synchronized void goToFriend(Human friend){
        System.out.println("Go to " + friend);
    }
}
