package ua.org.oa.ivanovd.task4_1;

/**
 * Created by Администратор on 02.06.2016.
 */
public class Auto {
    private String model;
    private int yearOfRelease;

    public Auto(String model, int yearOfRelease) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
