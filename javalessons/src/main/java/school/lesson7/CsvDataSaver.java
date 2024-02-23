package school.lesson7;

import java.io.FileWriter;
import java.io.IOException;

public class CsvDataSaver {
    public void save(AppData data, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {

            for (int i = 0; i < data.getHeader().length; i++) {
                writer.append(data.getHeader()[i]);
                if (i < data.getHeader().length - 1) {
                    writer.append(";");
                }
            }
            writer.append("\n");


            for (int[] row : data.getData()) {
                for (int i = 0; i < row.length; i++) {
                    writer.append(String.valueOf(row[i]));
                    if (i < row.length - 1) {
                        writer.append(";");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
