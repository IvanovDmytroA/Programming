package ua.org.oa.ivanovd.task4_1;

/**
 * Created by Администратор on 02.06.2016.
 */
public class Computer implements Comparable<Computer>{

    private int yearOfRelease;
    private double cpuFrequency;

    public Computer(int yearOfRelease, double cpuFrequency) {
        this.yearOfRelease = yearOfRelease;
        this.cpuFrequency = cpuFrequency;
    }


    @Override
    public int compareTo(Computer o) {
        int result = Integer.valueOf(this.yearOfRelease).compareTo(o.yearOfRelease);
        if(result != 0) {
            return result;
        } else {
            return Double.valueOf(this.cpuFrequency).compareTo(o.cpuFrequency);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "yearOfRelease=" + yearOfRelease +
                ", cpuFrequency=" + cpuFrequency +
                '}';
    }
}
