package school.lesson2;

public class StringPrinter {
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        String message = "Hello, world!";
        int repeatCount = 3;

        printStringMultipleTimes(message, repeatCount);
    }
}
