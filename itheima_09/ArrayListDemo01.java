import java.util.ArrayList;



import java.util.ArrayList;
public class ArrayListDemo01 {
    public static void main(String[] args) {
        //ArrayList ���췽����
        //public ArrayList();����һ���յļ��϶���
        ArrayList<String>  array = new ArrayList<String>();

        System.out.println("array:"+array);
        //Array��ӷ�����
        //public boolean add ��E e������ָ����Ԫ��׷�ӵ��˼��ϵ�ĩβ
       // System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add��int index��E element �ڼ�����ָ��λ�ò���ָ����Ԫ��

        //array.add(1, "javase"); //1λ�õ�Ԫ��������
        //array.add(3, "javaee"); //1λ�õ�Ԫ��������
        //array.add(4, "javaee");  //IndexOutOfBoundsException 

        System.out.println("array:"+array);
        



    }
   
    
}
