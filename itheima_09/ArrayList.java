
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList {

    /*
     * ���� ������һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
     * ѧ������
     * 1.����һ��ѧ���࣬Ϊ�˼���¼�뷽�㣬��ѧ�����еĳ�Ա����������ΪString����
     * 2.�������϶���
     * 3.����¼��ѧ����������Ҫ������
     * 4.����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
     * 5.�����������ѧ������
     * 6.��������
     */
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        /*
         * 
         * Scanner sc= new Scanner(System.in);
         * System.out.println("������ѧ��������");
         * String name =sc.nextLine();
         * 
         * System.out.println("������ѧ�����䣺");
         * String age =sc.nextLine();
         * 
         * Student s = new Student();
         * s.setName(name);
         * s.setAge(age);
         * 
         * 
         * array.add(s);
         */

        // Ϊ����ߴ���ĸ����ԣ������÷������Ľ�����
        addStudent(array);
        addStudent(array);
        addStudent(array);

        for(int i =0 ;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }

    /*
     * ������ȷ��
     * ����ֵ���ͣ�void
     * ������ArrayList<StudentDemo04> array
     */

    public static void addStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ��������");
        String name = sc.nextLine();

        System.out.println("������ѧ�����䣺");
        String age = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        array.add(s);
    }

}
