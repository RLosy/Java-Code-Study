import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo02 {
    
    public static void main(String[] args) {
        
        //��������
        ArrayList<String> array = new ArrayList<String>();
        //���Ԫ��
        array.add("hello");
        array.add("world");
        array.add("java");

        //System.out.println(array);

        //1.public boolean remove (object o)ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
      /*   System.out.println(array.remove("hello"));  //ture
        System.out.println(array.remove("javaee"));   //false
        System.out.println(array);
 */


        // 2.pulic E remove (int index)ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
      /*   System.out.println(array.remove(1));  //world

        System.out.println(array.remove(3));//����Խ��
        System.out.println(array);
 */



        // 3.public E set(int index,E element)�޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��

       /*  System.out.println(array.set(1, "javaee")); //[hello, javaee, java]
        System.out.println(array); */



        //4.public E get(int index)����ָ����������Ԫ��
        /* System.out.println(array.get(0));  //hello
        System.out.println(array);  //[hello, world, java]
        System.out.println(array.get(3));  //IndexOutOfBoundsException����Խ�� */



        //5.public int size()���ؼ����е�Ԫ�صĸ���
        //System.out.println(array.size());   //3
    }
}
