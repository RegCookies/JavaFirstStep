package Foundation;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello wold");

        /*
         * 常量：
         *   1：在整个程序执行中，不会改变的
         *       1：字符串常量 "Foundation.HelloWorld"
         *       2：整数常量  21
         *       3：小数常量  12.12
         *       4：字符常量  '\a'  单引号
         *       5：布尔常量  true, false
         *       6: 空常量   null
         * */
        System.out.println(12);
        System.out.println(24);
        System.out.println('a');
        int a = 0;
        String b = "";
        a = 1;
        b = "abc";
        System.out.println(a);
        System.out.println(b);
    }
}
/*
 * 关键字
 *  1：组成关键字是字母全部小写
 *  2：常见的代码编辑器对关键字有特殊的颜色标记
 *
* */

/*
*  计算机最小的信息单元叫 位 bit
*  计算机最小的存储单元叫 字节 byte
*
* */

/*
*  数据类型
*   1.八种基本的数据类型
*       1:byte 8位有符号的 以二进制补码 -128 ~ 127
*       2:short  16位有符号的 ~32768 - 32767
*       3:int 32位有符号的 -2^31 - 2^31
*       4:long 64位有符号的 -2^64 - 2^64
*       5:float 单精度，32位 IEEE745
*       6:double 双精度 64位
*       7:boolean：布尔 true false
*       8:char: 字符 单一的16为Unicode字符
*
* */

/*
*  Java 变量：
*       1：类变量
*       2：实例变量
*       3：局部变量
*
* */

/*
*  Java 隐式转换
*   1：byte,short,char, --int,  --long, --float, --double
*  有最大转换最大
* */

