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
    ArrayList<String> expec = new ArrayList<String>();
    assertEquals(expec, links);
}

@Test
public void testFiletest4() throws IOException {
    Path fileName = Path.of("Third-test-file.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);

    assertEquals(List.of("https://ucsd-cse12-sp22.github.io/syllabus.html"), links);
}

@Test
public void testFiletestremake() throws IOException {
    Path fileName = Path.of("test-fileremake.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);

    assertEquals(List.of("https://something.com", "some-thing.html"), links);
}

@Test
public void testFiletest2remake() throws IOException {
    Path fileName = Path.of("test-file2.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);

    ArrayList<String> expected = new ArrayList<String>();
    assertEquals(List.of("https://something.com", "some-page.html"), links);
}

@Test
public void testFiletest3remake() throws IOException {
    Path fileName = Path.of("test-file3.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);
    ArrayList<String> expected = new ArrayList<String>();
    assertEquals(expected, links);
}
@Test

public void testFiletest4remake() throws IOException {
    Path fileName = Path.of("test-file4.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);

    ArrayList<String> expected = new ArrayList<String>();
    assertEquals(expected, links);
}

// @Test
// public void testFiletest5() throws IOException {
//     Path fileName = Path.of("test-file5.md");
//     String content = Files.readString(fileName);
//     ArrayList<String> links = MarkdownParse.getLinks(content);

//     ArrayList<String> expected = new ArrayList<String>();
//     assertEquals(expected, links);
// }

@Test
public void testFiletest6() throws IOException {
    Path fileName = Path.of("test-file6.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(content);

    ArrayList<String> expected = new ArrayList<String>();
    assertEquals(expected, links);
}

// @Test
// public void testFiletest7() throws IOException {
//     Path fileName = Path.of("test-file7.md");
//     String content = Files.readString(fileName);
//     ArrayList<String> links = MarkdownParse.getLinks(content);

//     ArrayList<String> expected = new ArrayList<String>();
//     assertEquals(expected, links);
// }

// @Test
// public void testFiletest8() throws IOException {
//     Path fileName = Path.of("test-file8.md");
//     String content = Files.readString(fileName);
//     ArrayList<String> links = MarkdownParse.getLinks(content);

//     assertEquals(List.of("a link on the first line"), links);
// }

}