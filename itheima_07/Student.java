public class Student {
    // ��׼�������
    //��Ա����
    private String name;
    private int age;
    //���췽��
    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //��Ա����
    public void setName(String name) {
        this.name = name;

    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+age);
    }

}
