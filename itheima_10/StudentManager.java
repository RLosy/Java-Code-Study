import java.util.ArrayList;
import java.util.Scanner;

//import javax.print.DocFlavor.STRING;

/* 学生管理系统 */
public class StudentManager {
    /*
     * 1.用输出语句完成主界面的编写
     * 2.用Scanner实现键盘录入数据
     * 3.用Switch语句完成操作的选择
     * 4.用循环完成再次回到主界面
     * 
     */

    public static void main(String[] args) {
        // 创建集合对象用于存储学生对象
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    // System.out.println("1 添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("2 删除学生");
                    break;

                case "3":
                    System.out.println("3 修改学生");
                    break;

                case "4":
                    System.out.println("4 查看所有学生");
                    break;

                case "5":
                    System.out.println("5 谢谢使用！");
                    // break;
                    System.exit(0);// jvh退出

            }
        }
    }

    // 定义一个方法，用于添加学生信息
    public static void addressStudent(ArrayList<Student> array) {
        // 键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String.sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String.name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String.age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String.address = sc.nextLine();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 将学生对象添加到集合中

        array.add(s);

        // 给出添加成功提示
        System.out.println("添加学生成功！");

    }
}