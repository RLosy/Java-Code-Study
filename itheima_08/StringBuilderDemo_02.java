import java.util.Scanner;

public class StringBuilderDemo {

    // public static void main(String[] args) {
    /*
     * //1.����StringBuilder���췽��
     * //1.public StringBuilder()������һ���հ׿ɱ��ַ������󣬲������κ�����
     * 
     * 
     * StringBuilder sb=new StringBuilder();
     * System.out.println("sb"+sb);
     * System.out.println("sb.length:"+sb.length());
     * 
     * //public StringBuilder��String str)�����ַ��������ݣ��������ɱ��ַ�������
     * 
     * StringBuilder sb2=new StringBuilder("hello");
     * System.out.println("sb2"+sb2);
     * System.out.println("sb2.length:"+sb2.length());
     */

    // 2.StringBulider��Ӻͷ�ת
    /*
     * 1.public StringBulier append(��������)��������ݣ��������ݱ���
     * 2.public StringBulier reverse();�����෴���ַ�����
     */
    // ��������
    // StringBuilder sb1 = new StringBuilder();
    // 1.public StringBulier append(��������)��������ݣ��������ݱ���
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
    // ��ʽ���
    /*
     * sb1.append("hello").append("world").append("java").append(100);
     * System.out.println("sb1:" + sb1);
     * 
     * // * 2.public StringBulier reverse();�����෴���ַ�����
     * sb1.reverse();
     * System.out.println("sb1:" + sb1);
     */

    // 3.StringBuilder��String֮����໥ת��
    /*
     * 1.StringBuilderת��ΪString
     * public String toString������ͨ��toString()�Ϳ��԰�StringBuliderת��ΪString
     * 2.String ת��StringBulider
     * public StringBuildr(String s)��ͨ�����췽���Ϳ���ʵ��Stringת��ΪStringBuilder
     */
    // StringBuilderת��ΪString
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

    // String ת��StringBulider
    /*
     * String s ="hello";
     * StringBuilder sb = new StringBuilder(s);
     * System.out.println("sb:"+sb);
     */

    // 4.�ַ���ƴ��������
    /*
     * 
     * 1.����һ��int ���͵����飬�þ�̬��ʼ�������Ԫ�صĳ�ʼ��
     * 2.����һ�����������ڰ�int �����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ�������
     * ����ֵ������String�����б�int[]arr
     * 3.�ڷ�������StringBuilder����Ҫ�����ƴ�ӣ����ѽ��ת��String����
     * 4.���÷�������һ���������ս��
     * 5.������
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
    ��/*
     * ����һ��������ʵ���ַ�����ת������¼��һ���ַ��������ø÷������ڿ���̨�����������������abc���cba
     * 1.����¼��һ���ַ�������Scannerʵ��
     * 2.����һ��������ʵ���ַ�����ת������ֵ������String������String s
     * 3.�ڷ�������StringBuliderʵ���ַ����ķ�ת�����ѽ��ת��String����
     * 4.���÷�������һ���������ս��
     * 5.������
     */
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * 
     * System.out.println("������һ���ַ�����");
     * 
     * String line = sc.nextLine();
     * 
     * String s = stringReverse(line);
     * System.out.println("s" + s);
     * 
     * }
     * 
     * public static String stringReverse(String s) {
     * �ڷ�����StringBuilderʵ���ַ����ķ�ת�����ѽ��ת��String����
     * String----StringBuilder ---resverse()---string
     * 
     * StringBuilder sb = new StringBuilder(s); // ������Ҫ��s������
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