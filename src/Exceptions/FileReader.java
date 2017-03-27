package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathan McDevitt on 2017-03-27.
 */
public class FileReader {
    private static String upReader;

    public static List<List<String>> readTableFile(String filename) throws IOException {
        BufferedReader in = setUpReader(filename);
        String line;
        List<List<String>> table = new ArrayList<>();
        int lineNum = -1;
        while (in.ready()) {
            lineNum++;
            line = in.readLine();
            String[] tokens = line.split("\\s+|\\t+");

            if (lineNum == 0) {
                /** Header line. Add headers to the header list. This will define the columns of the table. */
                for (int i = 0; i < tokens.length; i++) {
                    table.add(new ArrayList<>());
                    table.get(i).add(tokens[i]);
                }
            } else {
                /** Data row. Add values to each column.    */
                for (int i = 0; i < table.size(); i++) {
                    table.get(i).add(tokens[i]);
                }
            }
        }
        in.close();
        return table;
    }

    public static List<String> readListFile(String filename) throws IOException {
        BufferedReader in = setUpReader(filename);
        List<String> contents = new ArrayList<>();
        while (in.ready()) {
            contents.add(in.readLine());
        }
        return contents;
    }

    public static String readParagraphFile(String filename) throws IOException {
        BufferedReader in = setUpReader(filename);
        StringBuilder builder = new StringBuilder();
        String line;
        while (in.ready()) {
            line = in.readLine().replace("\n", "");
            builder.append(line);
        }
        return builder.toString();
    }

    public static BufferedReader setUpReader(String filename) throws FileNotFoundException {
        return new BufferedReader(new java.io.FileReader(new File(filename)));
    }
}
