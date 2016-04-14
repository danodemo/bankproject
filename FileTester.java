import java.io.File;
import java.io.FileWriter;

/**
 * Created by danarchy on 4/14/16.
 */
public class FileTester {

    public static void main(String[] args) {
        System.out.println("Testing file writing!");
        testWrite();
    }

    public static void testWrite() {

        try {
            System.out.println("Trying to write a file.");
            File testFile = new File("test.txt");
            FileWriter testWriter = new FileWriter(testFile);
            testWriter.write("Testing writing to file..." + "\n");
            testWriter.write("Here is a second line for the lulz...");
            testWriter.close();

        } catch (Exception myException) {
            System.out.println("Something fucked up, you big dummy.");
        }
    }
}
