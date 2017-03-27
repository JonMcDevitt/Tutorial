package Exceptions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jonathan McDevitt on 2017-03-27.
 */
public class FileReaderTest {
    @Test
    public void readTableFile() throws Exception {
        List<List<String>> table = FileReader.readTableFile("data.txt");
        assertNotNull(table);
        assertTrue(table.size() > 0);
    }

    @Test
    public void readListFile() throws Exception {
        List<String> list = FileReader.readListFile("names.txt");
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    @Test
    public void readParagraphFile() throws Exception {
        String paragraph = FileReader.readParagraphFile("paragraph.txt");
        assertTrue(paragraph.length() > 0);
    }
}