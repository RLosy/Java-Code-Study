import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class ArrayListDemo04 {
  
        
        //�������洢ѧ�����󲢱���
        /* 
        ���󣺴���һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
        1.����һ��ѧ����
        2.�������϶���
        3.����ѧ������
        4.���ѧ�����󵽼�����
        5.�������ϣ�����ͨ�ñ�����ʽʵ��
        */
        public static void main(String[] args) {
            //2.�������϶���
            ArrayList<Student> array = new ArrayList<Student>();
            //3.����ѧ������

            Student s1 = new Student("lalisa",21);
            Student s2 = new Student("rosy",21);
            Student s3 = new Student("jisoo",21);
            //4.���ѧ�����󵽼�����
            array.add(s1);
            array.add(s2);
            array.add(s2);
            //5.�������ϣ�����ͨ�ñ�����ʽʵ��
            for(int i =0 ;i<array.size();i++)
            {
                Student s = array.get(i);
                System.out.println(s.getName()+","+s.getAge());
            }     
    }
    
}
