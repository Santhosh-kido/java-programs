
import java.io.*;
import java.util.*;


public class CountOfWordFileHandling extends IOException {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        Map<String, Integer> wordscount = new HashMap<>();

        try {
            br = new BufferedReader(new FileReader("input2.txt"));
            bw = new BufferedWriter(new FileWriter("output2.txt"));

            String line = br.readLine();
            while (line != null) {
                line = line.toLowerCase();
                line = line.replaceAll("[^a-z0-9\\s]", "");
                String[] words = line.split(" ");

                for (String word : words) {
                    if (wordscount.containsKey(word)) {
                        wordscount.replace(word, wordscount.get(word) + 1);
                    } else {
                        wordscount.put(word, 1);
                    }
                }

                line = br.readLine();
            }
             System.out.println(wordscount);

            for(String word:wordscount.keySet()){
                bw.write(word+" : "+wordscount.get(word));
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
