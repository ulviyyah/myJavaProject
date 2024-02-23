package school.lesson2;

public class ArrayCreator {
    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        // Заполняем каждую ячейку массива значением initialValue
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    public static void main(String[] args) {

        int length = 5;
        int initialValue = 10;

        int[] resultArray = createArray(length, initialValue);


        System.out.println("Созданный массив:");
        printArray(resultArray);
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}