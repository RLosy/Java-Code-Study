import java.util.ArrayList;
import java.util.Scanner;

//import javax.print.DocFlavor.STRING;

/* ѧ������ϵͳ */
public class StudentManager {
    /*
     * 1.�����������������ı�д
     * 2.��Scannerʵ�ּ���¼������
     * 3.��Switch�����ɲ�����ѡ��
     * 4.��ѭ������ٴλص�������
     * 
     */

    public static void main(String[] args) {
        // �������϶������ڴ洢ѧ������
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            System.out.println("--------��ӭ����ѧ������ϵͳ--------");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴����ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    // System.out.println("1 ���ѧ��");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("2 ɾ��ѧ��");
                    break;

                case "3":
                    System.out.println("3 �޸�ѧ��");
                    break;

                case "4":
                    System.out.println("4 �鿴����ѧ��");
                    break;

                case "5":
                    System.out.println("5 ллʹ�ã�");
                    // break;
                    System.exit(0);// jvh�˳�

            }
        }
    }

    // ����һ���������������ѧ����Ϣ
    public static void addressStudent(ArrayList<Student> array) {
        // ����¼��ѧ����������Ҫ�����ݣ���ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ��ѧ�ţ�");
        String.sid = sc.nextLine();
        System.out.println("������ѧ��������");
        String.name = sc.nextLine();
        System.out.println("������ѧ�����䣺");
        String.age = sc.nextLine();
        System.out.println("������ѧ����ס�أ�");
        String.address = sc.nextLine();

        // ����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // ��ѧ��������ӵ�������

        array.add(s);

        // ������ӳɹ���ʾ
        System.out.println("���ѧ���ɹ���");

    }
}