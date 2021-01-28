import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        ReadFile();
    }
    public static void ReadFile() {
        try {
            FileWriter myWriter = new FileWriter("out.txt");
            File myObj = new File("in.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                myWriter.write(myReader.nextLine() + "\n");
            }
            myReader.close();
            myWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(1);
    }
}