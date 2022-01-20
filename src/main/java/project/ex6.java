package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ex6 {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("Simple.txt");
        BufferedReader bufferedReader = new BufferedReader(file);

        String st = bufferedReader.readLine();


    }
}
