package school.lesson7;

public class Main {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        data.setData(new int[][]{{100, 200, 123}, {300, 400, 500}});

        CsvDataSaver saver = new CsvDataSaver();
        saver.save(data, "data.csv");

        CsvDataLoader loader = new CsvDataLoader();
        AppData loadedData = loader.load("data.csv");


        System.out.println("Loaded Header:");
        for (String header : loadedData.getHeader()) {
            System.out.print(header + "\t");
        }
        System.out.println("\nLoaded Data:");
        for (int[] row : loadedData.getData()) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
