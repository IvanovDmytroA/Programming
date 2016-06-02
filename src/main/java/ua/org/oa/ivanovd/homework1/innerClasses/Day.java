package ua.org.oa.ivanovd.homework1.innerClasses;

/**
 * Created by Администратор on 15.05.2016.
 */
public enum Day {

    MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);
    private int index;

    private Day(int index) {
        this.index = index;
    }

    public static Day valueOf(int index) {
        switch (index) {
            case 0:
                return MONDAY;
            case 1:
                return TUESDAY;
            case 2:
                return WEDNESDAY;
            case 3:
                return THURSDAY;
            case 4:
                return FRIDAY;
            case 5:
                return SATURDAY;
            case 6:
                return SUNDAY;
        }
        return null;
    }
}
