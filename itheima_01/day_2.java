package itheima_01;
/* public class day_2 {
    public static void main(String[] args) 
    {
     */
// 1. ����һ����̬����
/*
 * int[] arr = new int[3];
 * // �����������Ԫ��
 * System.out.println(arr);
 * System.out.println(arr[0]);
 * System.out.println(arr[1]);
 * System.out.println(arr[2]);
 * System.out.println("-------");
 */
// ������:[I@28a418fc 0 0 0

// �������е�Ԫ�ظ�ֵ
/*
 * arr[0] = 100;
 * arr[2] = 200;
 * // �ٴ��������
 * System.out.println(arr);
 * System.out.println(arr[0]);
 * System.out.println(arr[1]);
 * System.out.println(arr[2]);
 * System.out.println("-------");
 */

// ����ڶ�������ָ���һ������
/*
 * int [] arr2=arr;
 * arr2[0]=111;
 * arr2[1]=222;
 * arr2[2]=333;
 * System.out.println(arr2);
 * System.out.println(arr2[0]);
 * System.out.println(arr2[1]);
 * System.out.println(arr2[2]);
 * System.out.println("-------");
 */

// 2.��̬��������

/*
 * int[] arr3 ={1,2,3};
 * System.out.println(arr3);
 * System.out.println(arr3[0]);
 * System.out.println(arr3[1]);
 * System.out.println(arr3[2]);
 * System.out.println("-------");
 */

// 3.���鳣���÷������ͻ�ȡ��ֵ

// ��������
/*
 * int [] arr ={11,22,33,44,55};
 * for(int x=0;x<arr.length;x++)
 * {
 * System.out.println(arr[x]);
 * }
 */

// ��ȡ��ֵ
/*  int[] arr = { 12, 45, 98, 80, 11 };
// int max;
// ��ȡ�����еĵ�һ��������Ϊ�����ĳ�ʼֵ
int max = arr[0];
for (int i = 0; i < arr.length; i++)

{
    if (arr[i] < max)
    {
        max = arr[i];
    }
}
System.out.println("max:" + max); */

//4.�����Ķ���͵���

//public class day_2 {
// public static void main(String[] args) {
// ���÷���
//1. isEvenNumber();
//2. getMax();
//3.����ֵ�ĵ���
//isEvenNumber(10);
//3.�����ĵ���
/* int number =10;
isEvenNumber(number); */

// }

/*
 * // 1.����һ���������ڷ����ж���һ���������жϸ������Ƿ���ż��
 * public static void isEvenNumber() {
 * // �������
 * int number = 9;
 * // �жϸ������Ƿ���ż��
 * if (number % 2 == 0)
 * 
 * {
 * System.out.println(true);
 * } else {
 * System.out.println(false);
 * }
 * }
 */
//2.�ж��������ֵĴ�С����ϴ���Ǹ���
/*   public static void getMax() {
      int a = 10;
      int b = 20;
      if (a > b) {
          System.out.println(a);

      } else {
          System.out.println(b);

      }
  } */
//3.��������������͵���
/*    public static void isEvenNumber(int number){
       if(number%2==0)
       {
           System.out.println(true);
       } else {
            System.out.println(false);
       }
   }
}
*/
//4.��������������ϰ
/*     public class day_2{
        public static void main(String[]args)
        {
            //���÷�����ʱ���˼�Ҫ�������������˼�Ҫʲô���;ʹ�ʲô���͵�ֵ
            //��main���������е��ö���õķ�����ʹ�ó�����
            //getMax(10, 20);
            //��main���������е��ö���õķ�����ʹ�ñ�����
            // int a=10;
            //int b=20;
            // getMax(a, b); 
        }
    public static void getMax(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
   */
//5.������ֵ�����Ķ���͵���
/* public class day_2{
    public static void main(String[] args)
    {
        //��������������;
        isEvenNumber(10);
        //�������� ������=��������������;
        boolean flag = isEvenNumber(10);
        System.out.println(flag);

    }
    public static boolean isEvenNumber(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
 */
//6.������ֵ�����Ķ���͵���
//���һ���������Ի�ȡ�������Ľϴ�ֵ�����������ڲ���
/* public class day_2 {
    public static void main(String[] args) {
        //��main���������е��ö���õķ�����ʹ�ñ�������
        int result = getMax(10, 20);
        System.out.println(result);
        //��main���������е��ö���õķ�������ֱ�Ӵ�ӡ���
        System.out.println(getMax(10, 20));
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
 */
//7.��������
/* �������أ�
���������ͬһ������
�������������ͬ�ķ�����
��������Ĳ�������ͬ�����Ͳ�ͬ����������ͬ

�뷵��ֵ�޹�
�ڵ��õ�ʱ��java�������ͨ�������Ĳ�ͬ������ͬ���ķ���
*/
/*     public class day_2{
        public static void main(String[]args)
        {
            System.out.println(sum(10, 20));

           // double result= sum(10.1,20.2);
           //System.out.println(result);
           System.out.println(sum(10.1,20.2 ));

           System.out.println(sum(10,20,30));


        }
        //������int���͵����ݺͷ���
        public static int sum (int a,int b)
        {
            return a+b;
        }
        //������double���͵����ݺͷ���
        public static double sum (double a,double b) 
        {
            return a + b;
        }
        //������int�������ݺͷ���
        public static int sum (int a,int b,int c) 
        {
            return a + b + c;
        }
    } */

//8.����������ϰ
//ʹ�÷������ص�˼����ƱȽ����������Ƿ���ͬ�ķ���������ȫ�������ͣ�byte��short��int��long��
/* public class day_2 {
    public static void main(String[] agrs) {public class day_2 {
    public static void main(String[] agrs) {
        System.out.println(compare(10, 20));
        //���Զ����ֽ���ǿ��ת��
        System.out.println(compare((byte)10,(byte)20));

        System.out.println(compare(10L,20L));

        System.out.println(compare((short)10,(short)20));
        

    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

} */
//9.�����������ݻ�������
//���ڻ����������͵Ĳ�������ʽ�����ĸı䣬��Ӱ��ʵ�ʲ�����ֵ
/* public class day_2 {
    public static void main(String[] agrs) {
        int number = 100;
        System.out.println("����change����ǰ��ֵ"+number);  
        change(number);
        System.out.println("����change�������ֵ"+number);  

    }

    public static void change(int number) {
        number = 200;
    }

} */
/* ����change����ǰ��ֵ100
����change�������ֵ100 */
//10.��������������������
//�����������͵�ֵ����ʽ�����ĸı䣬Ӱ��ʵ�ʲ�����ֵ
/* public class day_2 {
    public static void main(String[] agrs) {
        int[] arr = {10,20,30};
        System.out.println("����change����ǰ��ֵ"+arr[1]);  
        change(arr);
        System.out.println("����change�������ֵ"+arr[1]);  

    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }

}
 */
//11.�������
//���һ�������������������Ҫ������Ľ������һ���ϵġ����磺[11,22,33,44,55]
/* public class day_2 {
    public static void main(String[] agrs) {
        int[] arr = { 11, 22, 33, 44, 55};
        System.out.print("["); 

        for (int i = 0; i < arr.length; i++) {
            //�����ж϶��Ÿ���
            if(i==arr.length-1)
            {
             System.out.print(arr[i]); //������ݲ�����

            }else{
             System.out.print(arr[i]+","); //������ݲ�����

            }
            //System.out.println(arr[i] + ","); // ������ݻ���
        }
        System.out.println("]"); 

    }

} */
//12.�������ֵ
//���һ���������ڻ�ȡ������Ԫ�ص����ֵ�����÷�����������

/* public class day_2 {
    public static void main(String[] agrs) {

        int[] arr = { 11, 22, 33, 55 };

        // ���û�ȡ���ֵ�ķ������ñ������շŻؽ��
        int result = getMax(arr);
        System.out.println("result:" + result);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        // ��������x�Ǵ�1��ʼ��
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])

            {
                max = arr[i];
            }
        }
        // �������Ƿ��غ���������
        return max;
    }

} */
//13.Debug�鿴ż�����
//�鿴ѭ����ż���͵�ִ������
/* public class day_2 {
    public static void main(String[] agrs) {
        // ������ͱ���
        int sum = 0;
        // ѭ�����
        for (int i = 1; i <= 10; i++)
         {
            if (i % 2 == 0) 
            {
                sum += i;
            }
        }
        System.out.println("1-100��ż����Ϊ:"+sum);
    }
} */
//Debug�鿴��������
/* import java.util.Scanner;

public class day_2 {
    public static void main(String[] agrs) {
        //��������
        Scanner sc = new Scanner(System.in);
        //��������
        System.out.println("�������һ��������");
        int i = sc.nextInt();
        
        System.out.println("������ڶ���������");
        int j = sc.nextInt();
        
        
        //���÷���
        int max = getMax(i, j);
        //������
        System.out.println("�ϴ��ֵ�ǣ�"+ max);

    }
    //��ȡ�������Ľϴ�ֵ
    public static int getMax(int i, int j)

    {
        if (i > j)
        {
            return i;
        } else
         {
            return j;
        }
    }

}
 */