package school.lesson2;

public class NegativeChecker {
    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {

        int testNumber = -7;

        boolean result = isNegative(testNumber);

        if (result) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
}
