package school.lesson2;

public class ArrayMultiplier {
    public static void main(String[] args) {

        int[] originalArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        System.out.println("Исходный массив:");
        printArray(originalArray);


        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] < 6) {
                originalArray[i] *= 2;
            }
        }


        System.out.println("\nМассив после умножения чисел меньше 6 на 2:");
        printArray(originalArray);
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
