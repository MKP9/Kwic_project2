package lineManager;

import alphaSort.AlphaSort;
import readFile.ReadFile;
import shiftData.ShiftData;

/* This class will handle the lines read in from ReadFile.java for use in ShiftData.java,
 * so the line is stored separately from IO, Sort, and Shift.
 */
public class LineHandler {

    ReadFile readFile = new ReadFile();
    ShiftData shiftData = new ShiftData();
    AlphaSort alphaSort = new AlphaSort();
}
