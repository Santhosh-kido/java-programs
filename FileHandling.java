
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling extends IOException {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        int out=0;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            bw = new BufferedWriter(new FileWriter("output.txt",true));

            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }

            br.close();
            bw.close();
            out = 1;
        } catch (Exception e) {
            out = -1;
        }
        finally{
            if(out == 1){
                System.out.println("Sucess: File copied successfully");
            }
            else{
                System.out.println("Error: File not copied");
            }
        }

    }
}