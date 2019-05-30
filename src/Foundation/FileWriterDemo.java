package Foundation;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("a.txt", true);
        f.write("hello\n");


        /*
        *
        * 数据换行
        *
        * */
        f.write("yes\n");
        f.flush();
        f.close();
    }
}
