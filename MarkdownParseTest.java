import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks()
    {
        Path fileName = Path.of("test-file.md");
        String content;
        try {
            content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            assertEquals("Testing for first link", links.get(0), "https://something.com");
            assertEquals("Testing for second link", links.get(1), "some-thing.html");


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}