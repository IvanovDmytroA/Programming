package ua.org.oa.ivanovd.homework1.anonymousClasses;

/**
 * Created by Администратор on 24.04.2016.
 */
public class Car {

    private String model; // Модель авто
    private int yearOfRelease;  // Год выпуска



    /* Getters and setters */
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


    /* Конструктор */
    public Car(String model, int yearOfRelease) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfRelease != car.yearOfRelease) return false;
        return model != null ? model.equals(car.model) : car.model == null;

    }
}
