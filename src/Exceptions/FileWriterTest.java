package Exceptions;

import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jonathan McDevitt on 2017-03-27.
 */
public class FileWriterTest {
    @Test
    public void writeToFile() throws Exception {
        String paragraph = FileReader.readParagraphFile("paragraph.txt");
        File newFile = FileWriter.writeToFile(paragraph, "paragraphOut.txt");
        assertTrue(newFile.exists());
    }

    @Test
    public void writeListToFile() throws Exception {
        List<String> list = FileReader.readListFile("names.txt");
        File newFile = FileWriter.writeListToFile(list, "namesOut.txt");
        assertTrue(newFile.exists());
    }

    @Test
    public void writeTableToFile() throws Exception {
        List<List<String>> table = FileReader.readTableFile("data.txt");
        File newFile = FileWriter.writeTableToFile(table, "dataOut.txt");
        assertTrue(newFile.exists());
    }
}