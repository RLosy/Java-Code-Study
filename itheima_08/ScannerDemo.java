import java.util.Scanner;

import javax.xml.transform.OutputKeys;

public class ScannerDemo {
    public static void main(String[] args) {
        
   /*  Scanner�����ڻ�ȡ����¼������ݡ�����������leix���ַ������ݣ�
    public String nextLine(); ��ȡ����¼����ַ������� */

        Scanner sc =new Scanner(System.in);

        System.out.println("������һ���ַ������ݣ�");

        String line =sc.nextLine();
      
        System.out.println("������������ǣ�"+line);

    }
}
