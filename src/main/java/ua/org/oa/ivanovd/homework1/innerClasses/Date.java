package ua.org.oa.ivanovd.homework1.innerClasses;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Администратор on 09.05.2016.
 */
public class Date {
    private short year; // Год
    private byte month; // Месяц
    private byte day; // День


    /* Getters and setters */
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public byte getDay() {
        return day;
    }

    /* Конструктор */
    public Date(int day, int month, int year) {
        this.day = (byte)day;
        this.month = (byte)month;
        this.year = (short)year;
    }

    /* Определение дня недели */
    public Day getDayOfWeek(){
        GregorianCalendar gc = new GregorianCalendar(getYear(), getMonth() - 1, getDay());
        return Day.valueOf(gc.get(Calendar.DAY_OF_WEEK) - 2);
    }

    /* Определение дня года */
    public int getDayOfYear(){
        GregorianCalendar gc = new GregorianCalendar(getYear(), getMonth() - 1, getDay());
        return gc.get(Calendar.DAY_OF_YEAR);
    }

    /* Определение разницы между датами */
    public int getDaysBetween(Date date) {
        GregorianCalendar firstDate = new GregorianCalendar();
        firstDate.set(getYear(), getMonth() - 1, getDay());
        Calendar secondDate = GregorianCalendar.getInstance();
        secondDate.set(date.getYear(), date.getMonth() - 1, date.getDay());
        long daysBetween = Math.abs(secondDate.getTimeInMillis() - firstDate.getTimeInMillis());
        daysBetween = daysBetween / 1000 / 3600 / 24;
        return (int)daysBetween;
    }



    class Year {
        private int yearNumber; // Год
        private boolean isLeapYear; // Високосный год

        /* Getters and setters */
        public int getYearNumber() {
            return yearNumber;
        }

        public boolean getIsLeapYear() {
            return isLeapYear;
        }

        /* Конструктор */
        public Year(int yearNumber) {
            this.yearNumber = yearNumber;
            GregorianCalendar gc = new GregorianCalendar();
            isLeapYear = gc.isLeapYear(yearNumber);
        }
    }


    class Month {
        private int monthNumber; // Месяц

        /* Getters and setters */
        public int getMonthNumber() {
            return monthNumber;
        }

        public Month(int monthNumber) {
            this.monthNumber = monthNumber;
        }

        /* Количество дней в месяце */
        public int getDaysInMonth(int monthNumber, boolean isLeap) {
                int daysInMonth = 0;
                switch (monthNumber) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        daysInMonth = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        daysInMonth = 30;
                        break;
                    case 2:
                        if (isLeap == true) {
                            daysInMonth = 29;
                            break;
                        } else {
                            daysInMonth = 28;
                            break;
                        }
                }
                return daysInMonth;
            }
        }

    @Override
        public String toString() {
            return day + "." + month + "." + year;
        }
    }
