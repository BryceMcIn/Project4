import java.util.*;
import java.io.*;
import java.util.Scanner;

public class DuplicateRemover {

    private ArrayList<String> uniqueWords = new ArrayList<String>();

    Scanner inFS = null;
    String temp;


    public void remove(FileInputStream dataFile) {

        uniqueWords.add("");
        inFS = new Scanner(dataFile);
        int counter = 0;

        while (inFS.hasNext()) {

            temp = inFS.next();

            for (int i = 0; i <= uniqueWords.size() - 1; i++) {
                if (temp.equals(uniqueWords.get(i))) {
                    counter++;
                }
            }

            if (counter == 0) {
                uniqueWords.add(temp);
            }

            counter = 0;
        }
    }

        public void write (FileOutputStream outputFile){

            PrintWriter outFS = new PrintWriter(outputFile);

            for(int i = 0; i <= uniqueWords.size() - 1; i++) {
                outFS.print(uniqueWords.get(i) + " ");
            }

            outFS.flush();
        }
}
