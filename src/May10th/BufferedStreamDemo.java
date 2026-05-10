package Day01.src.May10th;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) {
        Reader reader = null;
        BufferedWriter bw = null;
        try {
            reader = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(reader);
            bw = new BufferedWriter(new FileWriter("test2.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
