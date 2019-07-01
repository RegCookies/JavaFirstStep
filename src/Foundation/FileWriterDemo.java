package Foundation;

import java.io.FileWriter;
import java.io.IOException;



/*
   java 中的命名规范:
   1: 类, 接口：大驼峰
   2: 变量, 方法： 小驼峰
   3: 常量名: 所有字符都大写，用下划线想链接
 */
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
