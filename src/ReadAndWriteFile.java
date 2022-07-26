import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("numbers.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Fie không tồn tại!");
        }
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        System.out.println("Giá trị lớn nhất: " + max);
    }
}
