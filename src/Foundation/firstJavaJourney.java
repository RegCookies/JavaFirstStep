package Foundation;
import java.util.Scanner;

public class firstJavaJourney {
    public static int sup() {
        int s = 0;
        for (int i = 0; i < 100; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据");
        int s = sc.nextInt();
        System.out.println("请输入另一个数据");
        int y = sc.nextInt();
        System.out.println(s + y);
        int k = sup();
        System.out.println(k);

        String sName = "hello";
    }
}


