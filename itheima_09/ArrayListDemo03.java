//import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {

        // 1.存储字符串并遍历（创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合）
        /*
         * 1.创建集合对象
         * 2.往集合中添加字符串对象
         * 3.遍历集合，首先要能够获取到集合中的每一个元素，这个通过get（int index）方法实现
         * 4.遍历集合，其次要能够获取到集合的长度，这个通过size（）方法实现
         * 5.遍历集合的通用格式
         * for（int i=0；i<集合对象.size（）；i++）{
         * 集合对象.get(i)就是指定索引处的元素
         * }
         */
        ArrayList<String> array = new ArrayList<String>();

        array.add("lalisa");
        array.add("rosy");
        array.add("jisoo");

        /*
         * System.out.println(array.get(0));
         * System.out.println(array.get(1));
         * System.out.println(array.get(2));
         */
        // 遍历集合，首先要能够获取到集合中的每一个元素，这个通过get（int index）方法实现
        /*
         * for (int i = 0; i < 3; i++) {
         * System.out.println(array.get(i));
         * }
         */
        // 遍历集合，其次要能够获取到集合的长度，这个通过size（）方法实现

        // System.out.println(array.size());

        // 5.遍历集合的通用格式 size 获取元素 get拿到元素 定义一个变量接收数据最后输出变量
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);

            System.out.println(s);

        }

    }

}
