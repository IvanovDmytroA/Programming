package ua.org.oa.ivanovd.homework1.innerClasses;

import java.time.Month;
import java.time.Year;

/**
 * Created by Администратор on 09.05.2016.
 */
public class App {
    public static void main(String[] args) {
        Date date1 = new Date(10, 2, 1992);
        System.out.println("Дата: " + date1);
        System.out.println("День недели: " + date1.getDayOfWeek());
        System.out.println("Порядковый номер дня в году " + ": " + date1.getDayOfYear());
        Date date2 = new Date(15, 05, 2016);
        System.out.println();
        System.out.println("Дата для рассчета разницы в днях: " + date2);
        System.out.println("Количество дней между " + date1 + " и " + date2 + ": " + date1.getDaysBetween(date2));
        System.out.println();
        Date.Year year = date1.new Year(1992);
        System.out.println(year.getYearNumber() + " високосный год: " + year.getIsLeapYear());
        System.out.println();
        Date.Month month = date1.new Month(2);
        System.out.println("Количество дней в месяце: " + month.getDaysInMonth(month.getMonthNumber(), true));

    }
}
