import java.util.Scanner;

public class StringBuilderDemo {

    // public static void main(String[] args) {
    /*
     * //1.两种StringBuilder构造方法
     * //1.public StringBuilder()；创建一个空白可变字符串对象，不含有任何内容
     * 
     * 
     * StringBuilder sb=new StringBuilder();
     * System.out.println("sb"+sb);
     * System.out.println("sb.length:"+sb.length());
     * 
     * //public StringBuilder（String str)跟据字符串的内容，来创建可变字符串对象
     * 
     * StringBuilder sb2=new StringBuilder("hello");
     * System.out.println("sb2"+sb2);
     * System.out.println("sb2.length:"+sb2.length());
     */

    // 2.StringBulider添加和反转
    /*
     * 1.public StringBulier append(任意类型)：添加数据，返回数据本身
     * 2.public StringBulier reverse();返回相反的字符序列
     */
    // 创建对象
    // StringBuilder sb1 = new StringBuilder();
    // 1.public StringBulier append(任意类型)：添加数据，返回数据本身
    /*
     * StringBuilder sb2 =sb1.append("hello");
     * 
     * System.out.println("sb1:"+sb1);
     * System.out.println("sb2:"+sb2);
     * System.out.println(sb1==sb2);
     */
    /*
     * sb1.append("hello");
     * sb1.append("java");
     * sb1.append(100);
     */
    // 链式编程
    /*
     * sb1.append("hello").append("world").append("java").append(100);
     * System.out.println("sb1:" + sb1);
     * 
     * // * 2.public StringBulier reverse();返回相反的字符序列
     * sb1.reverse();
     * System.out.println("sb1:" + sb1);
     */

    // 3.StringBuilder和String之间的相互转换
    /*
     * 1.StringBuilder转换为String
     * public String toString（）：通过toString()就可以把StringBulider转换为String
     * 2.String 转换StringBulider
     * public StringBuildr(String s)；通过构造方法就可以实现String转换为StringBuilder
     */
    // StringBuilder转换为String
    /*
     * StringBuilder sb = new StringBuilder();
     * sb.append("hello");
     * 
     * // public String toString();
     * 
     * String s = sb.toString();
     * 
     * System.out.println("s:"+s);
     */

    // String 转换StringBulider
    /*
     * String s ="hello";
     * StringBuilder sb = new StringBuilder(s);
     * System.out.println("sb:"+sb);
     */

    // 4.字符串拼接升级版
    /*
     * 
     * 1.定义一个int 类型的数组，用静态初始完成数组元素的初始化
     * 2.定义一个方法，用于把int 数组中的数据按照指定格式拼接成一个字符串返回
     * 返回值类型是String参数列表int[]arr
     * 3.在方法中用StringBuilder按照要求进行拼接，并把结果转成String返回
     * 4.调用方法，用一个变量接收结果
     * 5.输出结果
     */
    
      /* 
      public static void main(String[] args) {
            int []arr={1,2,3,4,5};
      
            String s =arrayToString(arr);
      
            System.out.println("s:"+s);
      }
     
      public static String arrayToString(int[] arr) {
            StringBuilder sb = new StringBuilder();
                sb.append("[");
            
            for (int i = 0; i < arr.length; i++) {

                if (i == arr.length - 1) {
                // System.out.println(arr[i]);
                sb.append(arr[i]);
                } else {
                // System.out.println(arr[i]+",");
                sb.append(arr[i] + ",");
                
                }
            }
            sb.append("]");
            
            String s = sb.toString();
            return s;
    } */

    // 5.StringBuilder
    、/*
     * 定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果例如键盘输入abc输出cba
     * 1.键盘录入一个字符串，用Scanner实现
     * 2.定义一个方法，实现字符串反转。返回值类型是String，参数String s
     * 3.在方法中用StringBulider实现字符串的反转，并把结果转成String返回
     * 4.调用方法，用一个变量接收结果
     * 5.输出结果
     */
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * 
     * System.out.println("请输入一个字符串：");
     * 
     * String line = sc.nextLine();
     * 
     * String s = stringReverse(line);
     * System.out.println("s" + s);
     * 
     * }
     * 
     * public static String stringReverse(String s) {
     * 在方法中StringBuilder实现字符串的反转，并把结果转成String返回
     * String----StringBuilder ---resverse()---string
     * 
     * StringBuilder sb = new StringBuilder(s); // 这里需要把s传起来
     * 
     * sb.reverse();
     * 
     * String ss = sb.toString();
     * return s;
     * 
     * return new StringBuilder(s).reverse().toString();
     * }
     */

}