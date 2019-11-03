import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException{

        DuplicateRemover remover = new DuplicateRemover();

        FileInputStream input = null;
        FileOutputStream output = null;

        try {

            input = new FileInputStream("problem1.txt");
            output = new FileOutputStream("unique_words.txt");

            remover.remove(input);
            remover.write(output);

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
