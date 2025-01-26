package algorithm.c1.s2.exercises;

import edu.princeton.cs.algs4.StdOut;

class SmartDate{

    private static final int[] DAYS = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(String date) {
        String[] fields = date.split("/");
        if (fields.length != 3) {
            throw new IllegalArgumentException("Invalid date");
        } else {
            this.day = Integer.parseInt(fields[0]);
            this.month = Integer.parseInt(fields[1]);
            this.year = Integer.parseInt(fields[2]);
            if (!isValid(this.month, this.day, this.year)) {
                throw new IllegalArgumentException("Invalid date");
            }
        }
    }

    private static boolean isValid(int m, int d, int y) {
        if (m >= 1 && m <= 12) {
            if (d >= 1 && d <= DAYS[m]) {
                return m != 2 || d != 29 || isLeapYear(y);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean isLeapYear(int y) {
        if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else {
            return y % 4 == 0;
        }
    }

    public String getDayOfWeek() {
        int d = day;  // Day of the month
        int m = month;
        int y = year;

        // Adjust month and year for January and February
        if (m < 3) {
            m += 12;
            y--;
        }

        int K = y % 100;       // Year of the century
        int J = y / 100;       // Zero-based century

        // Zeller's formula
        int h = (d + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - (2 * J)) % 7;

        // Adjust for negative results
        if (h < 0) {
            h += 7;
        }

        // Day names
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[h];
    }

    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}

public class SmartDateClient {
    public static void main(String[] args) {
        SmartDate date = new SmartDate("12/04/2028");
        StdOut.println(date);
        StdOut.println(date.getDayOfWeek());
    }
}
