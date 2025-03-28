package exercise1;

/**
 * A custom exception class used to indicate that the input date is illegal.
 */
class IllegalDateException extends Exception {
    /**
     * Constructor for the IllegalDateException class.
     * 
     * @param message The error message to be displayed when the exception is thrown.
     */
    public IllegalDateException(String message) {
        super(message);
    }
}

/**
 * This class represents a date and provides methods to manipulate and validate dates.
 */
public class Data {
    private int year;
    private int month;
    private int day;

    /**
     * Constructor for the Data class.
     * 
     * @param year  The year of the date.
     * @param month The month of the date.
     * @param day   The day of the date.
     * @throws IllegalDateException If the input date is not legal.
     */
    public Data(int year, int month, int day) throws IllegalDateException {
        if (!legal(year, month, day)) {
            throw new IllegalDateException("please enter a legal date");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Get the number of days in a given month of a given year.
     * 
     * @param year  The year.
     * @param month The month.
     * @return The number of days in the specified month of the specified year.
     */
    private int getDaysInMonth(int year, int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    /**
     * Check if a given date is legal.
     * 
     * @param year  The year of the date.
     * @param month The month of the date.
     * @param day   The day of the date.
     * @return true if the date is legal, false otherwise.
     */
    private boolean legal(int year, int month, int day) {
        if (year <= 0) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        if (day < 1 || day > daysInMonth[month - 1]) {
            return false;
        }

        return true;
    }

    /**
     * Check if a given year is a leap year.
     * 
     * @param year The year to be checked.
     * @return true if the year is a leap year, false otherwise.
     */
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Reset the date.
     * 
     * @param year  The new year of the date.
     * @param month The new month of the date.
     * @param day   The new day of the date.
     */
    public void setData(int year, int month, int day) {
        if (legal(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("You have to input a legal date");
        }
    }

    /**
     * Add one day to the current date.
     */
    public void addOneDay() {
        day++;
        if (day > getDaysInMonth(year, month)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    /**
     * Display the date in the format of "year/month/day".
     */
    public void display() {
        System.out.println(year + "/" + month + "/" + day);
    }
}