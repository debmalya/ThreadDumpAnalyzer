package parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaThreadDumpParserTest {

    @Test
    public void testVaildFile(){
          JavaThreadDumpParser javaThreadDumpParser = new JavaThreadDumpParserImpl();
          javaThreadDumpParser.parseJavaThreadDumpFile("./src/test/resource/TestThreadDump.txt");
    }

    @Test
    public void testNonExistingFile(){

    }

    @Test
    public void testNonThreadDumpFile(){

    }

}