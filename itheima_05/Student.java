import java.security.PublicKey;

//学生类
public class Student {

    private String name;
    private int age;

    // 构造类型
    public Student() {
        System.out.println("无参构造方法");
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
