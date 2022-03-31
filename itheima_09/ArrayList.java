
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList {

    /*
     * 需求 ：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
     * 学生对象
     * 1.定义一个学生类，为了键盘录入方便，把学生类中的成员变量都定义为String类型
     * 2.创建集合对象
     * 3.键盘录入学生对象所需要的数据
     * 4.创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
     * 5.往集合中添加学生对象
     * 6.遍历集合
     */
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        /*
         * 
         * Scanner sc= new Scanner(System.in);
         * System.out.println("请输入学生姓名：");
         * String name =sc.nextLine();
         * 
         * System.out.println("请输入学生年龄：");
         * String age =sc.nextLine();
         * 
         * Student s = new Student();
         * s.setName(name);
         * s.setAge(age);
         * 
         * 
         * array.add(s);
         */

        // 为了提高代码的复用性，我们用方法来改进程序
        addStudent(array);
        addStudent(array);
        addStudent(array);

        for(int i =0 ;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }

    /*
     * 两个明确：
     * 返回值类型：void
     * 参数：ArrayList<StudentDemo04> array
     */

    public static void addStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        array.add(s);
    }

}
