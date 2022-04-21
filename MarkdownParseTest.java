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
    
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("https://something.com");
    expected.add("some-thing.html");
    
    assertEquals(expected, links);
    
}

}