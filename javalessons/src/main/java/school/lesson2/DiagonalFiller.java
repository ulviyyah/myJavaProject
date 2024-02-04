package school.lesson2;

public class DiagonalFiller {
    public static void main(String[] args) {

        int size = 5; // Можете изменить размер по вашему выбору


        int[][] squareArray = new int[size][size];


        for (int i = 0; i < size; i++) {
            squareArray[i][i] = 1;
        }


        System.out.println("Квадратный массив с единичной диагональю:");
        printArray(squareArray);
    }


    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
