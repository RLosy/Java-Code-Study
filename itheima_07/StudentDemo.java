public class StudentDemo {

    public static void main(String[] args) {
    //�޲������췽�����������ʹ��setXxx������ֵ
    Student s1=new Student();
    s1.setName("lalisa");
    s1.setAge(20);
    s1.show();

    //ʹ�ô��������췽��ֱ�Ӵ�����������ֵ�Ķ���
    Student s2=new Student("����ϼ",30);
    s2.show();
    
    }
    
}
