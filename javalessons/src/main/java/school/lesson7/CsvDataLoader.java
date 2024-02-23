package school.lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvDataLoader {
    public AppData load(String filePath) {
        AppData appData = new AppData();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String headerLine = reader.readLine();
            String[] header = headerLine.split(";");
            appData.setHeader(header);


            String line;
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                if (rowCount == 0) {
                    appData.setData(new int[1][values.length]);
                } else {
                    int[][] newData = new int[rowCount + 1][values.length];
                    System.arraycopy(appData.getData(), 0, newData, 0, rowCount);
                    appData.setData(newData);
                }
                for (int i = 0; i < values.length; i++) {
                    appData.getData()[rowCount][i] = Integer.parseInt(values[i]);
                }
                rowCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appData;
    }
}
