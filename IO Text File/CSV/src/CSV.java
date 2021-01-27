import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class CSV {
    public static void main(String[] args) {
        String path = "country.txt";
        readFileText(path);
    }
    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] lines = line.split(",");
                for (String s : lines) {
                    System.out.print(s.substring(1, s.length()-1) + " ");
                }
                System.out.println("");
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File khong ton tai or noi dung co loi!");
        }
    }
}
