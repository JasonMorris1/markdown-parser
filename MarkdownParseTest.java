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

    public String readFile(String filename) throws IOException{
        Path fileName = Path.of(filename);
        String content;
        content = Files.readString(fileName);
        return content;

}
    @Test
    public void testGetLinks()
    {
        try {

            ArrayList<String> links = MarkdownParse.getLinks(readFile("test-file.md"));
            assertEquals("Testing for first link", links.get(0), "https://something.com");
            assertEquals("Testing for second link", links.get(1), "some-thing.html");


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void test2()
    {
        try {

            ArrayList<String> links = MarkdownParse.getLinks(readFile("test2.md"));
            System.out.println("links:" + links.size());
            assertEquals(links.get(0), "");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void test3()
    {
        try {

            ArrayList<String> links = MarkdownParse.getLinks(readFile("test3.md"));
            assertEquals("Testing for first link", links.get(0), "https://something.com");
            assertEquals("Testing for second link", links.get(1), "some-thing.html");


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    @Test
    public void test4()
    {
        try {

            ArrayList<String> links = MarkdownParse.getLinks(readFile("test4.md"));
            assertEquals(links.get(0), "[](test");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}