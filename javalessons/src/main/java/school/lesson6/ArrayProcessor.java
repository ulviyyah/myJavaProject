package school.lesson6;

public class ArrayProcessor {
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sumValid = processArray(validArray);
            System.out.println("Сумма элементов валидного массива: " + sumValid);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            int sumInvalid = processArray(invalidArray);
            System.out.println("Сумма элементов невалидного массива: " + sumInvalid);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage()); // Выводим сообщение об ошибке
        }
    }
}
