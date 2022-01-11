import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String text;

        System.out.println("write 1-20 in words");
        text = input.nextLine();
        input.close();
        System.out.println(text);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Input.txt"),true));
            writer.append(text);
            writer.newLine();
            System.out.println("Adding to File " + "Input.txt");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // write.ReadLine();
    }

}
