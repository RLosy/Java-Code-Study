import java.security.PublicKey;

//ѧ����
public class Student {

    private String name;
    private int age;

    // ��������
    public Student() {
        System.out.println("�޲ι��췽��");
    }

    public Student(String name) {
        this.name = name;
    }
    public Student(int age){
        this.age=age;
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }




    public void show() {
        System.out.println(name + "," + age);
    }
}
