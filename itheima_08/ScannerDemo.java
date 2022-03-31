import java.util.Scanner;

import javax.xml.transform.OutputKeys;

public class ScannerDemo {
    public static void main(String[] args) {
        
   /*  Scanner：用于获取键盘录入的数据。（基本数据leix，字符串数据）
    public String nextLine(); 获取键盘录入的字符串数据 */

        Scanner sc =new Scanner(System.in);

        System.out.println("请输入一个字符串数据：");

        String line =sc.nextLine();
      
        System.out.println("你输入的数据是："+line);

    }
}
