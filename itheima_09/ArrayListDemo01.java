import java.util.ArrayList;



import java.util.ArrayList;
public class ArrayListDemo01 {
    public static void main(String[] args) {
        //ArrayList 构造方法：
        //public ArrayList();创建一个空的集合对象
        ArrayList<String>  array = new ArrayList<String>();

        System.out.println("array:"+array);
        //Array添加方法：
        //public boolean add （E e）：将指定的元素追加到此集合的末尾
       // System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add（int index，E element 在集合总指定位置插入指定的元素

        //array.add(1, "javase"); //1位置的元素往后移
        //array.add(3, "javaee"); //1位置的元素往后移
        //array.add(4, "javaee");  //IndexOutOfBoundsException 

        System.out.println("array:"+array);
        



    }
   
    
}
