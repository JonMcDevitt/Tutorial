package Exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathan McDevitt on 2017-03-27.
 */
public class FileWriter {
    public static File writeToFile(String data, String filename) throws IOException {
        File file = new File(filename);
        BufferedWriter fileWriter = new BufferedWriter(new java.io.FileWriter(file));
        fileWriter.write(data + "\n");
        fileWriter.close();
        return file;
    }

    public static File writeListToFile(List<String> data, String filename) {
        File file = new File(filename);
        try (BufferedWriter fileWriter = new BufferedWriter(new java.io.FileWriter(file))) {
            for(String d : data) {
                fileWriter.write(d + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static File writeTableToFile(List<List<String>> table, String filename) {
        File file = new File(filename);
        List<String> rows = new ArrayList<>();
        for(int row = 0; row < table.get(0).size(); row++) {
            String rowToPrint = "";
            for(int col = 0; col < table.size(); col++) {
                rowToPrint += table.get(col).get(row) + "\t";
            }
            rows.add(rowToPrint);
        }
        /** How do we print these to the table? */

        return file;
    }
}
