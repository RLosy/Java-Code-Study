import java.util.Scanner;

import javax.xml.validation.Schema;

public class StringDemo {
    public static void main(String[] args) {
        /*
         * String ���췽����
         * public String (): ����һ���հ��ַ������󣬲������κ�����
         * public String (char[] chs):�����ַ���������ݣ��������ַ�������
         * public String (byte[] bys)�������ֽ���������ݣ��������ַ�������
         * String s ="abc";ֱ�Ӹ�ֵ�ķ�ʽ�����ַ����������ݾ���abc
         * �Ƽ�ʹ��ֱ�Ӹ�ֵ�ķ�ʽ�ķ�ʽ�õ��ַ���
         */

        /*
         * // public String (): ����һ���հ��ַ������󣬲������κ�����
         * String s1 = new String();
         * System.out.println("s1:" + s1);
         * 
         * // public String (char[] chs):���ַ���������ݣ��������ַ�������
         * char[] chs = {'a', 'b', 'c' };
         * String s2 = new String(chs);
         * System.out.println("s2:" + s2);
         * 
         * // public String (byte[] bys)�������ֽ���������ݣ��������ַ�������
         * 
         * byte[] byt={48,65,97}; //a-97 A-65 0-48
         * String s3 = new String (byt);
         * System.out.println("s3:" + s3);
         * 
         * // String s ="abc";ֱ�Ӹ�ֵ�ķ�ʽ�����ַ����������ݾ���abc
         * String s4 ="ABC";
         * System.out.println("s4:" + s4);
         */

        // 2.String �û���¼
        // ��֪�û��������룬���ó���ʵ��ģ���û��ĵ�¼���ܹ������λ��ᣬ��¼֮�󣬸�����Ӧ����ʾ
        /*
         * 
         * 1.��֪�û��������룬���������ַ�����ʾ����
         * 2.����¼��Ҫ��¼���û��������룬��scannerʵ��
         * 3.�ü���¼����û������������֪���û�����������бȽϣ�������Ӧ����ʾ���ַ��������ݱȽϣ���equals��������ʵ��
         * 4.��ѭ��ʵ�ֶ�λ��ᣬ����Ĵ�����ȷ������forѭ��ʵ�֣����ڵ�¼�ɹ���ʱ��ʹ��break����ѭ��
         */

        /*
         * String username = "Ldd";
         * String passward = "123456";
         * for (int i = 0; i < 3; ++i) {
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("�������û�����");
         * String name = sc.nextLine();
         * 
         * System.out.println("���������룺");
         * String pwd = sc.nextLine();
         * 
         * if (name.equals(username) && pwd.equals(passward)) {
         * System.out.println("��¼�ɹ�");
         * break;
         * } else {
         * if (2 - i == 0) {
         * System.out.println("����˻����������������Ա��ϵ��");
         * 
         * } else {
         * // 2,1,0
         * // i,0,1,2
         * System.out.println("��¼ʧ�ܣ��㻹��" + (2 - i) + "�λ��ᣡ");
         * }
         * 
         * }
         * }
         */

        // 3.�����ַ���������¼��һ���ַ�����ʹ�ó���ʵ���ڿ���̨�������ַ�����
        /*
         * ˼·��
         * 1.����¼��һ���ַ�������scannerʵ��
         * 2.�����ַ���������Ҫ�ܹ���ȡ���ַ����е�ÿһ�ַ�
         * public char charAt(int index):����ָ����������charֵ���ַ���������Ҳ�Ǵ�0��ʼ��
         * 3.�����ַ��������Ҫ�ܹ���ȡ���ַ����ĳ���
         * public intlength���������ش��ַ����ĳ���
         * ����ĳ��ȣ�������.lenghth
         * �ַ����ĳ��ȣ��ַ�������.length()
         * 4.���������ͨ�ø�ʽ
         * for��int i= 0��i<s.length������i++){
         * s.charAt(i);//����ָ�����������ַ�ֵ
         * }
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("��Ӽ����������ַ�����");
         * 
         * String line = sc.nextLine();
         * // �����ַ���������Ҫ�ܹ���ȡ���ַ����е�ÿһ���ַ�
         * // System.out.println(line.charAt(0));
         * 
         * // �����ַ����Ż�
         * for (int i = 0; i < line.length(); i++) {
         * System.out.println(line.charAt(i));
         * }
         */

        // 4.ͳ���ַ�����������¼��һ���ַ�����ͳ�Ƹ��ַ��д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ����������������ַ�����
        /*
         * 1.����¼��һ���ַ�������Scannerʵ��
         * 2.Ҫͳ���������͵��ַ��������趨������ͳ�Ʊ�������ʼֵ��Ϊ0
         * 3.�����ַ������õ�ÿһ���ַ�
         * 4.�жϸ��ַ��������������ͣ�Ȼ���Ӧ���͵�ͳ�Ʊ���+1
         * 5.����������͵��ַ�����
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("������һ���ַ�����");
         * String line = sc.nextLine();
         * 
         * int bigCount = 0;
         * int smallCount = 0;
         * int numberCount = 0;
         * 
         * for (int i = 0; i < line.length(); i++) {
         * //��ȡ���鳤��
         * char ch = line.charAt(i);
         * //�жϵ����ַ�
         * if (ch >= 'A' && ch <= 'Z') {
         * bigCount++;
         * } else if (ch >= 'a' && ch <= 'z') {
         * smallCount++;
         * } else if (ch >= '0' && ch <= '9') {
         * numberCount++;
         * }
         * }
         * System.out.println("��д��ĸ" + bigCount + "��");
         * System.out.println("Сд��ĸ" + smallCount + "��");
         * System.out.println("����" + numberCount + "��");
         */

        // 5.ƴ���ַ���
        /*
         * ����һ����������int ���������ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷��������ڿ���̨�����������磬����Ϊint[]arr={1,2,3}
         * ִ�з������������Ϊ��[1,2,3]
         * ˼· ��
         * 1.����һ��int���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
         * 2.����һ�����������ڰ�int�����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ������ء�����ֵ����String�����б�int[] arr
         * 3.�ڷ����б������飬����Ҫ�����ƴ��
         * 4.���÷�����һ���������ս��
         * 5.������
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
         * s += "["; //+=��ʾƴ�ӵ���˼
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
        // 6.�ַ����ķ�ת
        /*
         * ����һ��������ʵ���ַ����ķ�ת������¼��һ���ַ��������ø÷������ڿ���̨������
         * �������¼��abc���cba
         * 1. ����¼��һ���ַ�������scannerʵ��
         * 2.����һ��������ʵ���ַ�����ת������ֵ����Ϊstring����string s
         * 3.�ڷ����а��ַ������ű�����Ȼ���ÿһ���õ����ַ�ƴ�ӳ�һ���ַ���������
         * 5.������
         */
/*         Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");

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











