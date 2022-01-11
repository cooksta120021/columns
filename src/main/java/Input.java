import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // added scanner for user input
        Scanner input = new Scanner(System.in);
        // user input will use a string
        String text;

        // asks user for input
        System.out.println("write 1-20 in words");
        // users input gets assigned to text
        text = input.nextLine();
        // closes the scanner
        input.close();
        // prints out what the user typed
        System.out.println(text);
        try {
            // writes data to a file called Input.txt and if data exists it will append to it
            BufferedWriter writer = new BufferedWriter(new FileWriter("Input.txt",true));
            // adds the user's text to the file
            writer.append(text);
            // creates a new line
            writer.newLine();
            // prints out adding to file followed by file name to let user know it is completed
            System.out.println("Adding to File " + "Input.txt");
            // closes the writer
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}