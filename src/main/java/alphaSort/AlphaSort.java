package alphaSort;

import lineManager.LineHandler;
import shiftData.ShiftData;

import java.util.ArrayList;
import java.util.List;

public class AlphaSort {

    public static void alphabetize(LineHandler manager) {

        List<String> tempLines = new ArrayList<String>();
        for(int i = 0; i < tempLines.size(); i++) {

        }
    }

    public void shift (List<String> lines) {

        //for loop will go thru the list of strings and for each line in the list
        //it will call moveWordToBack
        for(int i = 0; i < lines.size(); i++) {

            String l = ShiftData.moveWordToBack("");
            System.out.println("test " + l );
        }
    }
}
