//package itheima04;

/* public class Student {
    // ��Ա����
    String name;
    private int age;

    // �ṩget/set����
    public void setAge(int a) {
        // age =a;
        if (a < 0 || a > 120) {
            System.out.println("�������������");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    // ��Ա����
    public void show() {
        System.out.println(name + "," + age);
    }
}
 */

public class Student {

    // ��Ա����
    private String name;
    private int age;

    // get/set����
    public void setName(String n){
        name = n;
    }


    public String getName() {
        return name;
    }

    public void  setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}