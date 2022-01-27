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
    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> results = MarkdownParse.getLinks(contents);
        assertEquals("test-file.md links didn't extract correctly", List.of("https://something.com", "some-page.html"), results);
    }
    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> results = MarkdownParse.getLinks(contents);
        assertEquals("test-file2.md links didn't extract correctly", List.of("https://www.poptropica.com","not-even-real.html","https://www.netflix.com"), results);
    }
}