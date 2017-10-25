package readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

    /* KIWIC accepts a file with a set of lines, each line has a set of words,
     * each word consists of a set of characters
     */
    public void readfile() {

        //read_file
        try {
            FileReader fileReader = new FileReader(("data/testOne.txt"));
            BufferedReader bufferReader = new BufferedReader(fileReader);

            String testOne;

            while ((testOne = bufferReader.readLine()) != null) {

                // test print statement to confirm file IO works
                System.out.println(testOne + "\n");
            }

            bufferReader.close();
        } catch (IOException e) {

            System.out.println("File not found.");
        }

        // close readers
    }
}
