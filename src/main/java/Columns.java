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
       try {
           BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
           Random random = new Random();

           // Calls input from writer and creates new lines
           String line = reader.lines().collect(Collectors.joining(System.lineSeparator()));
           System.out.printf(String.format("%s%s", line.substring(0,0), line.substring(1,1)));
            /*  System.out.printf("%-30s %s", line, line,line); // Reads file
           System.out.printf("%-30s %s", line, "%-30s %s",line,"%-30s %s",line); // Reads file
           System.out.printf("%-30s %s", line, line,line); // Reads file
           System.out.printf("%-30s %s", line, line,line); // Reads file
           System.out.printf("%-30s %s", line, line,line); // Reads file */
           reader.close();
       }
       catch(Exception e){

       }
       // String.format("%-30s %s", line);
    }
}


