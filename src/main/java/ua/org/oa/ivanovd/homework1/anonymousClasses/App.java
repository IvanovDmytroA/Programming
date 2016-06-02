package ua.org.oa.ivanovd.homework1.anonymousClasses;

import java.lang.*;

/**
 * Created by Администратор on 24.04.2016.
 */
public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2014) {
            @Override
            public String toString() {
                return "The first car isn't Hyundai, it's " + getModel();
            }
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return true;

                Car car = (Car) o;

                if (getYearOfRelease() != car.getYearOfRelease()) return true;
                return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;
            }
        };

        Car car2 = new Car("Hyundai", 2016) {
            @Override
            public String toString() {
                return "But the second car is " + getModel();
            }
            @Override
                public boolean equals(Object o) {
                boolean yearOfRealeaseForAnClass = false;
                if (getYearOfRelease() > 2012) {
                    yearOfRealeaseForAnClass = true;
                }
                return yearOfRealeaseForAnClass;
            }
        };

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));
    }
}

