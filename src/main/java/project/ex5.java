package project;

import java.io.*;

public class ex5 {
//
public static void main(String[] args) {

    String fileName = "Simple.txt";

    try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));) {
        long sum = 0;

        while (true) {
            String lineRead = fileReader.readLine();
            if (lineRead == null) {

                break;
            }
            long num = Integer.parseInt(lineRead);
            sum += num;


        }

        System.out.println(sum);

    }

    catch (IOException e) {
        System.err.println("Error");
    }
}
}
