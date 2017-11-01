package console;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFile {

    @Test
    public void count()  {
        try {
            HashMap<String, Integer> map = new HashMap();
            FileWriter writeFile = new FileWriter("D:/resultFile.txt");
            FileReader readFile = new FileReader("D:/file.txt");
            Scanner scanner = new Scanner(readFile);

            String textInFile = scanner.nextLine();


            for (String words : textInFile.split(" ")) {
               if (map.containsKey(words)) {
                    map.put(words, map.get(words) + 1);
                } else {
                    map.put(words, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                writeFile.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }


            writeFile.close();
            readFile.close();

        } catch (IOException t) {
            System.out.println(t.getMessage());
        }

    }

}
