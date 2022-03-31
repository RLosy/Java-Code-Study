public class StudentDemo {

    public static void main(String[] args) {
    //无参数构造方法创建对象后使用setXxx（）赋值
    Student s1=new Student();
    s1.setName("lalisa");
    s1.setAge(20);
    s1.show();

    //使用带参数构造方法直接创建带有属性值的对象
    Student s2=new Student("林青霞",30);
    s2.show();
    
    }
    
}
