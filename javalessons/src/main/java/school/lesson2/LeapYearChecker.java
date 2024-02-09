package school.lesson2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Каждый 4-й год високосный
        // Но каждый 100-й год не високосный
        // За исключением каждого 400-го года, который всё равно високосный
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        int testYear = 2024;

        boolean result = isLeapYear(testYear);

        if (result) {
            System.out.println(testYear + " год является високосным.");
        } else {
            System.out.println(testYear + " год не является високосным.");
        }
    }
}
