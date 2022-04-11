package tryWithResources;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "src/main/java/tryWithResources/resources/output.txt";

        try {
            //create file
            File file = new File(path);
            file.createNewFile();

            //write in file:
            PrintWriter writer = new PrintWriter(file);
            writer.println("Lorem Ipsum is simply dummy text of the printing and " +
                    "typesetting industry. Lorem Ipsum has been the industry's standard" +
                    " dummy text ever since the 1500s, when an unknown printer took a galley " +
                    "of type and scrambled it to make a type specimen book. It has survived" +
                    " not only five centuries, but also the leap into electronic typesetting," +
                    " remaining essentially unchanged. It was popularised in the 1960s with " +
                    "the release of Letraset sheets containing Lorem Ipsum passages, and more" +
                    " recently with desktop publishing software like Aldus PageMaker including" +
                    " versions of Lorem Ipsum.");
            writer.close();
        } catch (FileAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Object o = new Object();
    }
}

