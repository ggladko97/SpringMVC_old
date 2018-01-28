package utils.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.junit.Test;
import utils.TxtUtils;

import static org.junit.Assert.*;

/**
 * Created by ggladko97 on 14.05.17.
 */
public class TxtUtilsTest {
  @Test
  public void stringFromInputStream() throws Exception {
    FileWriter fileWriter = new FileWriter(new File("/home/ggladko97/Desktop/tst.txt"));
    fileWriter.write("TestString");
    InputStream inputStream = new FileInputStream(new File("/home/ggladko97/Desktop/tst.txt"));
    String result = TxtUtils.stringFromInputStream(inputStream);
    assertEquals("TestString",result);
  }
}