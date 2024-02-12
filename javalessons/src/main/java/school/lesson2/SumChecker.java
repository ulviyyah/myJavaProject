package school.lesson2;

public class SumChecker {
    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {

        int number1 = 7;
        int number2 = 9;

        boolean result = isSumInRange(number1, number2);

        if (result) {
            System.out.println("Сумма чисел находится в пределах от 10 до 20 (включительно)");
        } else {
            System.out.println("Сумма чисел не находится в пределах от 10 до 20 (включительно)");
        }
    }
}

