package school.lesson2;

public class ArrayModifier {
    public static void main(String[] args) {

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        System.out.println("Исходный массив:");
        printArray(binaryArray);


        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }
        }


        System.out.println("\nМассив после замены:");
        printArray(binaryArray);
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
