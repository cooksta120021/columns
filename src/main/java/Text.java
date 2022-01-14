import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Text {
    int column;
    int counter = 0;
    ArrayList<String> temp = new ArrayList<>();
    public ArrayList<ArrayList<String>> entries = new ArrayList<>();

    public void displayText() {
        for (ArrayList<String> entry : entries) {
            System.out.println(Arrays.toString(entry.toArray()));
        }
    }

    public void addEntry(String s) {
        if (counter == 0) {
            entries.add(temp);
        }
        if (counter <= column) {
            temp.add(s);
            counter++;
        }
        if (counter == column) {
            temp = new ArrayList<>();
            counter = 0;
        }
    }

    public Text(int column) {
        this.column = column;
    }

    @Override
    public String toString() {

        return String.valueOf(entries);
    }

    public static void main(String[] args) throws FileNotFoundException {

        Text test = new Text(7);
//        test.addEntry("asd");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Input.txt"));
            writer.write(reader.toString());
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(test.entries);
//        System.out.print(test);
        test.displayText();
    }
}
