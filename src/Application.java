import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException{

        DuplicateCounter counter = new DuplicateCounter();

        FileInputStream input = null;
        FileOutputStream output = null;

        try {

            input = new FileInputStream("problem2.txt");
            output = new FileOutputStream("unique_words_counts.txt");


            counter.count(input);
            counter.write(output);


        }catch (IOException e){
            System.out.println("Your file probably doesn't exist");

        }finally {
            if(input != null) {
                input.close();
            }
            if(output != null) {
                output.close();
            }
        }



    }

}
