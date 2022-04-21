import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    


@Test
public void addition() {
    assertEquals(2, 1 + 1);
}

@Test
public void testFiletest() throws IOException {
    Path fileName = Path.of("test-file.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);
    assertEquals(List.of("https://something.com", "some-thing.html"), links);
    
}

@Test
public void testFiletest2() throws IOException {
    Path fileName = Path.of("new-test-file.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);
    assertEquals(List.of("https://ucsd-cse12-sp22.github.io/syllabus.html"), links);
    
}

@Test
public void testFiletest3() throws IOException {
    Path fileName = Path.of("second-test-file.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);
    assertEquals(List.of("https://ucsd-cse12-sp22.github.io/syllabus.html"), links);
    
}

@Test
public void testFiletest4() throws IOException {
    Path fileName = Path.of("Third-test-file.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);
    ArrayList<String> expected = new ArrayList<String>();
    assertEquals(expected, links);
    
}

}