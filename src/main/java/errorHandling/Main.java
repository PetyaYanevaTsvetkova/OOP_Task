package errorHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Throwable {
//
//        Order order1 = new Order();
//        Order order2 = new Order();
//        Order order3 = new Order();
//
//        order1.setTotalAmount(1.5);
//        System.out.println(order1.getTotalAmount());
//
//        System.out.println("------------------------");
//
//        order2.setTotalAmount(-5.6);
//        System.out.println(order2.getTotalAmount());
//
//        System.out.println("------------------------");
//
//        order3.setTotalAmount(150);
//        System.out.println(order3.getTotalAmount());
//
//        System.out.println("Test reThrow Exception ------------------------");
////        try {
////            RethrowException.methodSecond();
////        } catch (IllegalArgumentException e) {
////            System.out.println("Caught in main");
////            throw e;
////        }
//        //RethrowException.exceptionFromFirstMethod();
//
//        System.out.println("Test Throwable Exception ------------------------");
//        try {
//            int i = 10 / 0;
//        } catch (Throwable t) {
//            System.out.println(t.getMessage());
//        }
//
//        try {
//            int i = 10 / 0;
//        } catch (Exception e) {
//            StackTraceElement[] trace = e.getStackTrace();
//            System.out.println(trace[0].toString());
//            System.out.println(trace[0].getClass());
//            System.out.println(trace[0].getMethodName());
//            System.out.println(trace[0].getFileName());
//            System.out.println(trace[0].getLineNumber());
//        }

        //read from file:
        String filePath = "src/main/java/errorHandling/files/employees.txt";
        List<String> lines = Files.readAllLines(Path.of(filePath));

        List<String> names = new ArrayList<>();
        for (String line : lines) {
            for (String s : line.split(", ")) {
                names.add(s);
            }
        }
        System.out.println(String.join(" ", names));


        //create file output
        try {
            File myObj = new File("src/main/java/errorHandling/files/output.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //write in output file
        try {
            File outputFile = new File("src/main/java/errorHandling/files/output.txt");
            FileWriter myWriter = new FileWriter(outputFile);
            myWriter.write("Names of the employees: ");
            myWriter.write(System.lineSeparator());
            for (String name : names) {
                myWriter.write(name);
                myWriter.write(System.lineSeparator());
            }
            System.out.println("Successfully wrote to the file.");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}





