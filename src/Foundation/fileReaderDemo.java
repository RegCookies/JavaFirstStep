package Foundation;

import java.io.FileReader;
import java.io.IOException;

public class fileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fw = new FileReader("a.txt");

        int ch = fw.read();
        
        System.out.println(ch);
    }
}
