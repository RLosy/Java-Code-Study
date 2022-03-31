import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class ArrayListDemo04 {
  
        
        //案例：存储学生对象并遍历
        /* 
        需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        1.定义一个学生类
        2.创建集合对象
        3.创建学生对象
        4.添加学生对象到集合中
        5.遍历集合，采用通用遍历格式实现
        */
        public static void main(String[] args) {
            //2.创建集合对象
            ArrayList<Student> array = new ArrayList<Student>();
            //3.创建学生对象

            Student s1 = new Student("lalisa",21);
            Student s2 = new Student("rosy",21);
            Student s3 = new Student("jisoo",21);
            //4.添加学生对象到集合中
            array.add(s1);
            array.add(s2);
            array.add(s2);
            //5.遍历集合，采用通用遍历格式实现
            for(int i =0 ;i<array.size();i++)
            {
                Student s = array.get(i);
                System.out.println(s.getName()+","+s.getAge());
            }     
    }
    
}
