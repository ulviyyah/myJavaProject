package school.lesson2;

public class printPositiveNegative {
    public static void printPositiveNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void main(String[] args) {

        int testNumber = -5;

        printPositiveNegative(testNumber);
    }
}
