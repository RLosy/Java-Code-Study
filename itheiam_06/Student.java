/*
ѧ����

*/

public class Student {

    // ��Ա����
    private String name;
    private int age;

    // get/set����
    /*
     * public void setName(String n){
     * name = n;
     * }
     */

    public void setName(String name) {
        // name = name;
        // ʹ��this�ؼ���
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
     * public void setAge(int a) {
     * age = a;
     * }
     */
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}
