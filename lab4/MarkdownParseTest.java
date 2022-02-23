import static org.junit.Assert.*; //imports the assert commands from the junit library
import java.beans.Transient;
import org.junit.*; //imports junit library

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest { //class header
    @Test //tells java that junit is going to run a test
    public void addition() { //method header for junit test
        assertEquals(2, 1 + 1); //tests if 2 is equivalent to 1 + 1
    }
    public void testGetLinks(String error_message, List<String> list_of_links, String test_file) throws IOException {
        Path fileName = Path.of(test_file);
        String contents = Files.readString(fileName);
        ArrayList<String> results = MarkdownParse.getLinks(contents);
        assertEquals(error_message, list_of_links, results);
    }
    @Test
    public void testFile() throws IOException {
        testGetLinks("test-file.md links didn't extract correctly", List.of("https://something.com", "some-page.html"), "test-file.md");
    }
}