import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.stream.Collectors;

public class Columns {
    //This file or section will be about reading the input file
    //Code only reading from 1st line
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
        Random random = new Random();

        // Calls input from writer and creates new lines
        String line = reader.lines().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(line +"\n"); // Reads file
        reader.close();
    }
}


