import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo02 {
    
    public static void main(String[] args) {
        
        //创建对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //System.out.println(array);

        //1.public boolean remove (object o)删除指定的元素，返回删除是否成功
      /*   System.out.println(array.remove("hello"));  //ture
        System.out.println(array.remove("javaee"));   //false
        System.out.println(array);
 */


        // 2.pulic E remove (int index)删除指定索引处的元素，返回被删除的元素
      /*   System.out.println(array.remove(1));  //world

        System.out.println(array.remove(3));//索引越界
        System.out.println(array);
 */



        // 3.public E set(int index,E element)修改指定索引处的元素，返回被修改的元素

       /*  System.out.println(array.set(1, "javaee")); //[hello, javaee, java]
        System.out.println(array); */



        //4.public E get(int index)返回指定索引处的元素
        /* System.out.println(array.get(0));  //hello
        System.out.println(array);  //[hello, world, java]
        System.out.println(array.get(3));  //IndexOutOfBoundsException索引越界 */



        //5.public int size()返回集合中的元素的个数
        //System.out.println(array.size());   //3
    }
}
