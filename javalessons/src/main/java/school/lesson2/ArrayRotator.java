package school.lesson2;

public class ArrayRotator {
    public static void rotateArray(int[] array, int n) {
        int length = array.length;

        // При отрицательном n сдвигаем влево, при положительном - вправо
        if (n < 0) {
            n = length - Math.abs(n) % length;
        } else {
            n = n % length;
        }

        // Создаем временную переменную для временного хранения значения
        int temp;

        // Выполняем циклическое смещение
        for (int i = 0; i < gcd(length, n); i++) {
            temp = array[i];
            int j = i;

            while (true) {
                int k = (j + n) % length;
                if (k == i) {
                    break;
                }
                array[j] = array[k];
                j = k;
            }

            array[j] = temp;
        }
    }

    // Метод для нахождения наибольшего общего делителя (НОД)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Пример использования метода
        int[] testArray1 = {1, 2, 3};
        int n1 = 1;

        rotateArray(testArray1, n1);
        printArray(testArray1);

        int[] testArray2 = {3, 5, 6, 1};
        int n2 = -2;

        rotateArray(testArray2, n2);
        printArray(testArray2);
    }

    // Метод для вывода массива в консоль
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

