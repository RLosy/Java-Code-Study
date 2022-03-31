package itheima_01;
/* public class day_2 {
    public static void main(String[] args) 
    {
     */
// 1. 定义一个动态数组
/*
 * int[] arr = new int[3];
 * // 输出数组名及元素
 * System.out.println(arr);
 * System.out.println(arr[0]);
 * System.out.println(arr[1]);
 * System.out.println(arr[2]);
 * System.out.println("-------");
 */
// 输出结果:[I@28a418fc 0 0 0

// 给数组中的元素赋值
/*
 * arr[0] = 100;
 * arr[2] = 200;
 * // 再次输出数组
 * System.out.println(arr);
 * System.out.println(arr[0]);
 * System.out.println(arr[1]);
 * System.out.println(arr[2]);
 * System.out.println("-------");
 */

// 定义第二个数组指向第一个数组
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

// 2.静态定义数组

/*
 * int[] arr3 ={1,2,3};
 * System.out.println(arr3);
 * System.out.println(arr3[0]);
 * System.out.println(arr3[1]);
 * System.out.println(arr3[2]);
 * System.out.println("-------");
 */

// 3.数组常用用法遍历和获取最值

// 遍历数组
/*
 * int [] arr ={11,22,33,44,55};
 * for(int x=0;x<arr.length;x++)
 * {
 * System.out.println(arr[x]);
 * }
 */

// 获取最值
/*  int[] arr = { 12, 45, 98, 80, 11 };
// int max;
// 获取数组中的第一个数据作为变量的初始值
int max = arr[0];
for (int i = 0; i < arr.length; i++)

{
    if (arr[i] < max)
    {
        max = arr[i];
    }
}
System.out.println("max:" + max); */

//4.方法的定义和调用

//public class day_2 {
// public static void main(String[] args) {
// 调用方法
//1. isEvenNumber();
//2. getMax();
//3.常数值的调用
//isEvenNumber(10);
//3.变量的调用
/* int number =10;
isEvenNumber(number); */

// }

/*
 * // 1.定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
 * public static void isEvenNumber() {
 * // 定义变量
 * int number = 9;
 * // 判断该数据是否是偶数
 * if (number % 2 == 0)
 * 
 * {
 * System.out.println(true);
 * } else {
 * System.out.println(false);
 * }
 * }
 */
//2.判断两个数字的大小输出较大的那个数
/*   public static void getMax() {
      int a = 10;
      int b = 20;
      if (a > b) {
          System.out.println(a);

      } else {
          System.out.println(b);

      }
  } */
//3.带参数方法定义和调用
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
//4.带参数方法的练习
/*     public class day_2{
        public static void main(String[]args)
        {
            //调用方法的时候，人家要几个给几个，人家要什么类型就传什么类型的值
            //在main（）方法中调用定义好的方法（使用常量）
            //getMax(10, 20);
            //在main（）方法中调用定义好的方法（使用变量）
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
//5.带返回值方法的定义和调用
/* public class day_2{
    public static void main(String[] args)
    {
        //方法名（参数）;
        isEvenNumber(10);
        //数据类型 变量名=方法名（参数）;
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
//6.带返回值方法的定义和调用
//设计一个方法可以获取两个数的较大值，数据来自于参数
/* public class day_2 {
    public static void main(String[] args) {
        //在main（）方法中调用定义好的方法并使用变量保存
        int result = getMax(10, 20);
        System.out.println(result);
        //在main（）方法中调用定义好的方法并且直接打印输出
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
//7.方法重载
/* 方法重载：
多个方法在同一个类中
多个方法具有相同的方法名
多个方法的参数不相同，类型不同或者数量不同

与返回值无关
在调用的时候，java虚拟机会通过参数的不同来区分同名的方法
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
        //求两个int类型的数据和方法
        public static int sum (int a,int b)
        {
            return a+b;
        }
        //求两个double类型的数据和方法
        public static double sum (double a,double b) 
        {
            return a + b;
        }
        //求三个int类型数据和方法
        public static int sum (int a,int b,int c) 
        {
            return a + b + c;
        }
    } */

//8.方法重载练习
//使用方法重载的思想设计比较两个整数是否相同的方法，兼容全整数类型（byte，short，int，long）
/* public class day_2 {
    public static void main(String[] agrs) {public class day_2 {
    public static void main(String[] agrs) {
        System.out.println(compare(10, 20));
        //可以对数字进行强制转换
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
//9.方法参数传递基本类型
//对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
/* public class day_2 {
    public static void main(String[] agrs) {
        int number = 100;
        System.out.println("调用change方法前的值"+number);  
        change(number);
        System.out.println("调用change方法后的值"+number);  

    }

    public static void change(int number) {
        number = 200;
    }

} */
/* 调用change方法前的值100
调用change方法后的值100 */
//10.方法参数传递引用类型
//对于引用类型的值，形式参数的改变，影响实际参数的值
/* public class day_2 {
    public static void main(String[] agrs) {
        int[] arr = {10,20,30};
        System.out.println("调用change方法前的值"+arr[1]);  
        change(arr);
        System.out.println("调用change方法后的值"+arr[1]);  

    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }

}
 */
//11.数组遍历
//设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44,55]
/* public class day_2 {
    public static void main(String[] agrs) {
        int[] arr = { 11, 22, 33, 44, 55};
        System.out.print("["); 

        for (int i = 0; i < arr.length; i++) {
            //用于判断逗号个数
            if(i==arr.length-1)
            {
             System.out.print(arr[i]); //输出内容不换行

            }else{
             System.out.print(arr[i]+","); //输出内容不换行

            }
            //System.out.println(arr[i] + ","); // 输出内容换行
        }
        System.out.println("]"); 

    }

} */
//12.数组最大值
//设计一个方法用于获取数组中元素的最大值，调用方法并输出结果

/* public class day_2 {
    public static void main(String[] agrs) {

        int[] arr = { 11, 22, 33, 55 };

        // 调用获取最大值的方法，用变量接收放回结果
        int result = getMax(arr);
        System.out.println("result:" + result);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        // 别忘记了x是从1开始的
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])

            {
                max = arr[i];
            }
        }
        // 不能忘记返回函数的类型
        return max;
    }

} */
//13.Debug查看偶数求和
//查看循环求偶数和的执行流程
/* public class day_2 {
    public static void main(String[] agrs) {
        // 定义求和变量
        int sum = 0;
        // 循环求和
        for (int i = 1; i <= 10; i++)
         {
            if (i % 2 == 0) 
            {
                sum += i;
            }
        }
        System.out.println("1-100的偶数和为:"+sum);
    }
} */
//Debug查看方法调用
/* import java.util.Scanner;

public class day_2 {
    public static void main(String[] agrs) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();
        
        System.out.println("请输入第二个整数：");
        int j = sc.nextInt();
        
        
        //调用方法
        int max = getMax(i, j);
        //输出结果
        System.out.println("较大的值是："+ max);

    }
    //获取两个数的较大值
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