import java.util.Scanner;

import javax.xml.validation.Schema;

public class StringDemo {
    public static void main(String[] args) {
        /*
         * String 构造方法：
         * public String (): 创建一个空白字符串对象，不含有任何内容
         * public String (char[] chs):根据字符数组的内容，来创建字符串对象
         * public String (byte[] bys)；根据字节数组的内容，来创建字符串对象
         * String s ="abc";直接赋值的方式创建字符串对象，内容就是abc
         * 推荐使用直接赋值的方式的方式得到字符串
         */

        /*
         * // public String (): 创建一个空白字符串对象，不含有任何内容
         * String s1 = new String();
         * System.out.println("s1:" + s1);
         * 
         * // public String (char[] chs):根字符数组的内容，来创建字符串对象
         * char[] chs = {'a', 'b', 'c' };
         * String s2 = new String(chs);
         * System.out.println("s2:" + s2);
         * 
         * // public String (byte[] bys)；根据字节数组的内容，来创建字符串对象
         * 
         * byte[] byt={48,65,97}; //a-97 A-65 0-48
         * String s3 = new String (byt);
         * System.out.println("s3:" + s3);
         * 
         * // String s ="abc";直接赋值的方式创建字符串对象，内容就是abc
         * String s4 ="ABC";
         * System.out.println("s4:" + s4);
         */

        // 2.String 用户登录
        // 已知用户名和密码，请用程序实现模拟用户的登录。总共给三次机会，登录之后，给出相应的提示
        /*
         * 
         * 1.已知用户名和密码，定义两个字符串表示即可
         * 2.键盘录入要登录的用户名和密码，用scanner实现
         * 3.拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals（）方法实现
         * 4.用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
         */

        /*
         * String username = "Ldd";
         * String passward = "123456";
         * for (int i = 0; i < 3; ++i) {
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("请输入用户名：");
         * String name = sc.nextLine();
         * 
         * System.out.println("请输入密码：");
         * String pwd = sc.nextLine();
         * 
         * if (name.equals(username) && pwd.equals(passward)) {
         * System.out.println("登录成功");
         * break;
         * } else {
         * if (2 - i == 0) {
         * System.out.println("你的账户被锁定，请与管理员联系！");
         * 
         * } else {
         * // 2,1,0
         * // i,0,1,2
         * System.out.println("登录失败，你还有" + (2 - i) + "次机会！");
         * }
         * 
         * }
         * }
         */

        // 3.遍历字符串（键盘录入一个字符串，使用程序实现在控制台遍历该字符串）
        /*
         * 思路：
         * 1.键盘录入一个字符串，用scanner实现
         * 2.遍历字符串，首先要能够获取到字符串中的每一字符
         * public char charAt(int index):返回指定索引处的char值，字符串的索引也是从0开始的
         * 3.遍历字符串，其次要能够获取到字符串的长度
         * public intlength（）：返回此字符串的长度
         * 数组的长度：数组名.lenghth
         * 字符串的长度：字符串对象.length()
         * 4.遍历数组的通用格式
         * for（int i= 0；i<s.length（）；i++){
         * s.charAt(i);//就是指定索引处的字符值
         * }
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("请从键盘中输入字符串：");
         * 
         * String line = sc.nextLine();
         * // 遍历字符串，首先要能够获取到字符串中的每一个字符
         * // System.out.println(line.charAt(0));
         * 
         * // 遍历字符串优化
         * for (int i = 0; i < line.length(); i++) {
         * System.out.println(line.charAt(i));
         * }
         */

        // 4.统计字符次数（键盘录入一个字符串，统计该字符中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符））
        /*
         * 1.键盘录入一个字符串，用Scanner实现
         * 2.要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
         * 3.遍历字符串，得到每一个字符
         * 4.判断该字符串属于哪种类型，然后对应类型的统计变量+1
         * 5.输出三种类型的字符个数
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("请输入一个字符串：");
         * String line = sc.nextLine();
         * 
         * int bigCount = 0;
         * int smallCount = 0;
         * int numberCount = 0;
         * 
         * for (int i = 0; i < line.length(); i++) {
         * //获取数组长度
         * char ch = line.charAt(i);
         * //判断的是字符
         * if (ch >= 'A' && ch <= 'Z') {
         * bigCount++;
         * } else if (ch >= 'a' && ch <= 'z') {
         * smallCount++;
         * } else if (ch >= '0' && ch <= '9') {
         * numberCount++;
         * }
         * }
         * System.out.println("大写字母" + bigCount + "个");
         * System.out.println("小写字母" + smallCount + "个");
         * System.out.println("数字" + numberCount + "个");
         */

        // 5.拼接字符串
        /*
         * 定义一个方法，把int 数组中数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。例如，数组为int[]arr={1,2,3}
         * 执行方法后的输出结果为：[1,2,3]
         * 思路 ：
         * 1.定义一个int类型的数组，用静态初始化完成数组元素的初始化
         * 2.定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回。返回值类型String参数列表int[] arr
         * 3.在方法中遍历数组，按照要求进行拼接
         * 4.调用方法用一个变量接收结果
         * 5.输出结果
         */

        /*
         * int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
         * 
         * String s = arrayToString(arr);
         * System.out.println("s:" + s);
         * 
         * }
         * 
         * public static String arrayToString(int[] arr) {
         * String s = "";
         * 
         * s += "["; //+=表示拼接的意思
         * 
         * for (int i = 0; i < arr.length; i++) {
         * if (i == arr.length - 1) {
         * s += arr[i];
         * } else {
         * s += arr[i] + ",";
         * }
         * }
         * s += "]";
         * return s;
         */
        // 6.字符串的反转
        /*
         * 定义一个方法，实现字符串的反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
         * 例如键盘录入abc输出cba
         * 1. 键盘录入一个字符串，用scanner实现
         * 2.定义一个方法，实现字符串反转。返回值类型为string参数string s
         * 3.在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
         * 5.输出结果
         */
/*         Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");

        String s = sc.nextLine();

        String ss = reverse(s);
        System.out.println("ss:" + ss); 

    }

    public static String reverse(String s) {
        String ss = "";

        ss += "[";
        for (int i = s.length() - 1; i >= 0; i--) {
            
                ss += s.charAt(i)+",";
            }
        ss += "]";
        return ss;
    }

} */











