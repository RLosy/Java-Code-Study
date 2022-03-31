package itheima_01;


//1.案例减肥计划if版
/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数(1-7)：");

        int week = sc.nextInt();

        if (week == 1) {
            System.out.println("周一：跑步");

        } else if (week == 2) {
            System.out.println("周二：游泳");

        } else if (week == 3) {
            System.out.println("周三：慢走");

        } else if (week == 4) {
            System.out.println("周四：动感单车");

        } else if (week == 5) {
            System.out.println("周五：拳击");

        } else if (week == 6) {
            System.out.println("周六：爬山");

        } else if (week == 7) {
            System.out.println("周日：吃大餐");

        } else {
            System.out.println("您输入的数据有误！");

        }
    }

} */
//2.减肥计划Switch

/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数(1-7):");

        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;
            case 3:
                System.out.println("周三：慢走");
                break;
            case 4:
                System.out.println("周四：动感单车");
                break;
            case 5:
                System.out.println("周五：拳击");
                break;
            case 6:
                System.out.println("周六：爬山");
                break;
            case 7:
                System.out.println("周日：吃大餐");
                break;
            default:
                System.out.println("您输入的数据有误！");
        }

    }
} */
//3.逢7过（在控制台打印出1-100之间满足逢7必过的规则的数据，规则是数字包含7或者是7的倍数都要跳过）
/* public class day_3{
    public static void main(String[]args){
        for(int i=1;i<=100;i++)
        {
            if( i % 7 == 0 || i==7 || i % 10 == 7 ){
                System.out.print(i+",");
            }
            
        }

    }
} */
//4.不死神兔(斐波那契数列)
//有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月的兔子对数为多少？
/* public class day_3 {
    public static void main(String[]args){
    //为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        int [] arr = new int [20];

    //因为第一个月，第二个月兔子的对数是已知的，都是1，所以数组的第一个元素，第二个元素值也是1
        arr[0]=1;
        arr[1]=1;

    //循环实现计算每个月的兔子对数

        for(int i =2;i<arr.length;i++)
        {
            arr[i] = arr[i-2]+arr[i-1];
            
        }
    //输出数组中最后一个元素的值，就是第20个月的兔子对数
    System.out.println("第20个月的兔子数为:"+arr[19]); //第20个月的兔子数为:6765
    }
} */
//5.百钱百鸡（公鸡一值钱五，鸡母一值钱三，鸡雏三值钱一，白钱买百鸡，问公鸡母鸡和鸡雏各几只）
/* public class day_3 {
    public static void main(String[]args){
//第一层循环，用于表示公鸡的范围，初始化表达式的变量定义为 x=0判断条件是x<=20
        for(int x=0;x<=20;x++){
            //第二层循环，用于表示鸡母的范围，初始化表达式的变量定义为y=0判断条件是有y<=33
            for(int y =0;y<=33;y++){
                //这个时候，用于表示鸡的变量 z=100-x-y
                int z=100-x-y;
                //判断表达式 z%3==0和表达式 5*x+3*y+z/3=100同时成立
                if(z % 3 ==0 && 5*x+3*y+z/3 == 100 ){
                    System.out.println("x:"+x+","+"y:"+y+","+"z:"+z);
                }
            }
        }
    }
} */
//6.数组元素求和
//有一个数组元素是{68,27,95,88,171,996,51,210}求出该数组中满足要求的元素和，要求是：求和的元素个位和十位都不能是7，并且只能是偶数
/* public class day_3 {
    public static void main(String[] args) {
        
        
        int[] arr = { 68, 27, 95, 88, 171, 996, 51, 210 };
        int sum = 0;
        //i 的长度不能等于数组的长度只能小于数组的长度 会造成索引越界问题
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] % 100 / 10 != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("sum:"+sum);
    }
} */
//7.数组内容相同
//设计一个方法，用于比较两个数组的内容是否相同
//定义两个数组，分别使用静态初始化完成数组元素的初始值
//定义一个方法，用于比较两个数组的内容是否相同 返回值类型：boolean 参数：int[]arr ,int[]arr2
//首先比较数组的长度，如果长度不同，数组内容肯定不相同，返回false
//其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
//最后循环遍历结束后，返回true

/* public class day_3 {
    public static void main(String[] args) {
        // 定义两个//定义一个方法，用于比较两个数组的内容是否相同 返回值类型：boolean 参数：int[]arr
        // ,int[]arr2数组，分别使用静态初始化完成数组元素的初始值
        int[] arr = { 11, 22, 33, 44, 55 };
        int[] arr2 = { 11, 22, 33, 44, 5 };
        // 调用方法
        boolean flag = compare(arr, arr2);
        System.out.println(flag);
        // 定义一个方法，用于比较两个数组的内容是否相同 返回值类型：boolean 参数：int[]arr ,int[]arr2
    }

    public static boolean compare(int[] arr, int[] arr2) {
        // 首先比较数组的长度，如果长度不同，数组内容肯定不相同，返回false
        if (arr.length != arr2.length) {
            return false;
        }
        // 其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        // 最后循环遍历结束，返回true
        return true;
    }

} */
//8.已知一个数组arr={19,28,37,46,50}；键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值
/* 定义一个数组，用静态初始化完成数组元素的初始化
键盘录入要查找的数据，用一个变量接收
定义一个索引变量，初始值为-1
遍历数组，获取到数组中的每一个元素
拿键盘录入的数据和数组中的每一个元素进行比较，如果值相同，就该把对应的索引赋值给索引变量，并结束循环
输出索引变量 */
/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        // 定义一个数组，用静态初始化完成数组元素的初始化

        int[] arr = { 19, 28, 37, 46, 50 };
        // 键盘录入要查找的数据，用一个变量接收
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查找的数据:");

        int number = sc.nextInt();
        // 定义一个索引变量，初始值为-1
        //int index = -1;

        // for (int i = 0; i < arr.length; i++)

        //{
        //  if (arr[i] == number)  
        //  {
        //     index = i;
        //     break;
        //  }
        //} 
        //调用方法
        //   int index = getIndex(arr, number);
        //  输出索引变量
        //  System.out.println("index:"+index);
        //}


        //另外一个思路用一个方法
    public static int getIndex(int[] arr, int number) {

        int index = -1;

        for (int i = 0; i < arr.length; i++)

        {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;

    }
} */
//9.反转
/* public class day_3 {
    public static void main(String[] args) {
        int[] arr = { 19, 28, 37, 46, 50 };

        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        // 调用方法
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        System.out.print("[");
        // 记住for遍历的是数组
        for (int i = 0; i < arr.length; i++) {
            // if判断是boolean型 是==不是=
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
 */
//10.评委打分
/* 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）。 */
//定义一个数组，用动态化完成数组元素的初始化，长度为6
//键盘录入评委分数
//由于是6个评委打分，所以，接收评委分数的操作，用循环改进
 //定义一个方法实现获取数组中的最高分（数组最大值），调用方法
//定义一个方法实现获取数组中的最低分（数组最小值），调用方法
//定义一个方法实现获取数组中的所有元素的和（数组元素求和），调用方法
//按照计算规则进行算得平均分
//输出平均分
/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        // 定义一个数组，用动态化完成数组元素的初始化，长度为6
        int[] arr = new int[6];
        // 键盘录入评委分数
        Scanner sc = new Scanner(System.in);

        // 由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("请输入第"+(i+1)+"个评委打分：");
            arr[i] = sc.nextInt();
        }
        //调用最大值
        System.out.println("最大值为："+getMax(arr));
        //调用最小值
        System.out.println("最小值为："+getMin(arr));
        //调用数组求和
        System.out.println("数组元素的和为："+getSum(arr));
        //按照计算规则进行算得平均分
        int max =getMax(arr);
        int min=getMin(arr);
        int sum=getSum(arr);
        int avg =(sum-min-max)+(arr.length-2)/4;
        //输出平均分
        System.out.println("选手的平均分为："+avg);




    }
    //定义一个方法实现获取数组中的最高分（数组最大值），调用方法
    public static int getMax(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
       return max;
    }
      //定义一个方法实现获取数组中的最低分（数组最小值），调用方法
      public static int getMin(int[] arr)
      {
          int min=arr[0];
          for(int i=1;i<arr.length;i++){
              if(arr[i]>min)
              {
                  min=arr[i];
              }
          }
         return min;
      }
    //定义一个方法实现获取数组中的所有元素的和（数组元素求和），调用方法
      public static int getSum(int[] arr)
      {
          int sum=0;
          for(int i =0;i<arr.length;i++)
          {
            sum+=i;
          }
          return sum;
      }
}
 */
//11.类的对象的使用
/* public class day_3{
    public static void main(String[] args) {
       // String brand;
      //  String price;
        
        day_3 p = new  day_3();
       
        /* p.brand="iphone";
        p.price="5000";
        System.out.println(p.brand);
        System.out.println(p.price);
         
        p.call();
        p.sendMessage();


    }

public void call()
{
        System.out.println("打电话!");
}
public void sendMessage()
{
        System.out.println("发消息!");
}

} */