import java.io.*;
import java.util.*;

public class DuplicateCounter {

    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(FileInputStream dataFile){

        Scanner input = new Scanner(dataFile);
        String temp;
        Integer counter;

        while(input.hasNext()) {

            temp = input.next();

            counter = wordCounter.get(temp);

            if(counter == null){
                counter = 1;
            }
            else{
                counter++;
            }

            wordCounter.put(temp, counter);
        }
    }

    public void write(FileOutputStream dataFile){

        PrintWriter output = new PrintWriter(dataFile);

        for(String i : wordCounter.keySet()){
            output.println(i + " " + wordCounter.get(i));
        }

        output.flush();
    }


}
