package shiftData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShiftData {

    // Each read line can be circularly shifted by removing the first word
    // in the line and appending it to the end of the line.

    static List lineOfData = new ArrayList();

   /* This will take a line and shift first word to back of line and return the line
    * using Collections.rotate(list, 1)
    */
    public static String moveWordToBack(String line) {

        Collections.rotate(lineOfData, 1);
                
        return line;
    }
}
