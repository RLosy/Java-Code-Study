//import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {

        // 1.�洢�ַ���������������һ���洢�ַ����ļ��ϣ��洢3���ַ���Ԫ�أ�ʹ�ó���ʵ���ڿ���̨�����ü��ϣ�
        /*
         * 1.�������϶���
         * 2.������������ַ�������
         * 3.�������ϣ�����Ҫ�ܹ���ȡ�������е�ÿһ��Ԫ�أ����ͨ��get��int index������ʵ��
         * 4.�������ϣ����Ҫ�ܹ���ȡ�����ϵĳ��ȣ����ͨ��size��������ʵ��
         * 5.�������ϵ�ͨ�ø�ʽ
         * for��int i=0��i<���϶���.size������i++��{
         * ���϶���.get(i)����ָ����������Ԫ��
         * }
         */
        ArrayList<String> array = new ArrayList<String>();

        array.add("lalisa");
        array.add("rosy");
        array.add("jisoo");

        /*
         * System.out.println(array.get(0));
         * System.out.println(array.get(1));
         * System.out.println(array.get(2));
         */
        // �������ϣ�����Ҫ�ܹ���ȡ�������е�ÿһ��Ԫ�أ����ͨ��get��int index������ʵ��
        /*
         * for (int i = 0; i < 3; i++) {
         * System.out.println(array.get(i));
         * }
         */
        // �������ϣ����Ҫ�ܹ���ȡ�����ϵĳ��ȣ����ͨ��size��������ʵ��

        // System.out.println(array.size());

        // 5.�������ϵ�ͨ�ø�ʽ size ��ȡԪ�� get�õ�Ԫ�� ����һ������������������������
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);

            System.out.println(s);

        }

    }

}
