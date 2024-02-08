package school.lesson2;

public class ArrayFiller {
    public static void main(String[] args) {

        int[] numbersArray = new int[100];


        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i + 1;
        }


        System.out.println("Массив, заполненный значениями от 1 до 100:");
        printArray(numbersArray);
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
