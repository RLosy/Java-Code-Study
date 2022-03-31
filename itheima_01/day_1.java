package itheima_01;

//public class day_1 {
//public static void main(String[] args) {
/*
 * // System.out.println("黑马程序员");
 * // System.out.println("hello world");
 * 
 * // 1.定义变量
 * int a = 10;
 * // System.out.println(a);
 * 
 * a = 20;
 * System.out.println(a); // 20
 * 
 * // 2.变量使用的注意事项
 * byte b = 10;
 * System.out.println(b); // 10
 * 
 * short s = 100;
 * System.out.println(s); // 10
 * 
 * double d = 13.14;
 * System.out.println(d); // 13.14
 * 
 * char c = 'a';
 * System.out.println(c); // a
 * 
 * boolean o = true;
 * System.out.println(o); // true //变量名不可重复使用
 * 
 * // 定义long类型的变量
 * long l = 10000000000000l; // 系统默认的整数是int类型 为了防止整数过大，后面要加L
 * System.out.println(l);
 * 
 * // 定义float类型的变量
 * float f = 13.14f;
 * System.out.println(f); // flaot类型的变量定义的时候，为了防止类型不兼容，后面要加F
 * 
 * // 3.自动类型转换
 * double x =10;
 * System.out.println(x);//10.0
 * 
 * //定义byteleix的变量
 * byte z =10;
 * short v=b;
 * int i=b;
 * //char n=b; //char类型不兼容不能自动转换
 * 
 * System.out.println(i);//10
 * 
 * //4.强制类型转换
 * //int k=88.88;
 * int k =(int)88.88; //不建议会有数据的丢失
 * System.out.println(k);
 * //5.算数运算符
 * int p =6;
 * int q =4;
 * System.out.println(p+q);
 * System.out.println(p-q);
 * System.out.println(p*q);
 * System.out.println(p/q);
 * System.out.println(p%q); //除法得到的是商，取余得到的是余数
 * 
 * System.out.println(6.0/4);//整数相除只能得到整数，想要得到小数，必须有浮点数的参与
 */
/*
 * // 6.字符的“+”操作
 * int i = 10;
 * char c = 'A'; // A 65 A-Z连续
 * // c = 'a'; //a 97 a-z连续
 * // c = '0'; //0 48 0-9练续
 * System.out.println(i + c);
 * 
 * int j = i + c;
 * System.out.println(j);
 * 
 * // int k = 10 + 13.14;
 * // System.out.println(k + c);
 * 
 * double d = 10 + 13.14;
 * System.out.println(d + c);
 * 
 * System.out.println(1 + 90 + "liudd");
 * System.out.println("liudd" + 6 + 90);
 * System.out.println("liudd" + 6 + 6);
 */
/*   // 7.逻辑运算符
  int i = 10;
  int j = 20;
  int k = 30;

  System.out.println((i > j) & (i < k)); // a和b都是真 为true
  System.out.println((i > j) | (i < k)); // 有一个为真 为true
  System.out.println((i > j) ^ (i < k)); // a和b结果相同为false不同为true
  System.out.println(!(i > j)); // 结果与a的结果正好相反
  System.out.println("---------------");

  // 8.短路逻辑运算
  // System.out.println((i++ > 100) & (j++ > 100));
  System.out.println((i++ > 100) && (j++ > 100));
  System.out.println("i:" + i);
  System.out.println("j:" + j);
  System.out.println("---------------");
*/
/* // 9.三元运算符案例一
int weight1 = 100;
int weight2 = 200;

boolean b = weight1 > weight2 ? true : false;
System.out.println("b:" + b);
System.out.println("---------------");

// 10.三元运算符案例二

int weight3 = 100;
int weight4 = 200;
int weight5 = 300;

int tempHeight = weight3 > weight4 ? weight3 : weight4;
int maxHeight = tempHeight > weight5 ? tempHeight : weight5;
System.out.println("maxHeight" + maxHeight); */

//}
//}

//导包
//import java.util.Scanner;
//import java.util.Random;
//public class day_1 {
  //  public static void main(String[] args) {
        /*
         * //1.数据输入
         * // 创建对象
         * Scanner sc = new Scanner(System.in);
         * // 接收数据
         * int x = sc.nextInt();
         * // 输出数据
         * System.out.println("x:" + x);
         */

        // 2.三个和尚比身高用户输入
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * 
         * System.out.println("请输入第一个和尚的身高：");
         * int height1 = sc.nextInt();
         * 
         * System.out.println("请输入第二个和尚的身高：");
         * int height2 = sc.nextInt();
         * 
         * System.out.println("请输入第三个和尚的身高：");
         * int height3 = sc.nextInt();
         * 
         * int tempHeight = height1 > height2 ? height1 : height2;
         * int maxHeight = tempHeight > height3 ? tempHeight : height3;
         * 
         * System.out.println("三个和尚中最高的身高为:" + maxHeight); */
         

        // 3.if 语句求奇偶数

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("请输入一个整数：");
         * int i = sc.nextInt();
         * 
         * if (i % 2 == 0) {
         * System.out.println("该数为偶数："+i);  
         * } else {
         * System.out.println("该数为奇数："+i);  
         * 
         * }
         */
        // 4.if...else 语句判断星期

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("请输入一个星期数(1-7):");
         * int week = sc.nextInt();
         * 
         * if(week==1)
         * {
         * System.out.println("星期一"); 
         * 
         * }else if(week==2)
         * {
         * System.out.println("星期二");  
         * 
         * }else if(week==3)
         * {
         * System.out.println("星期三");  
         * 
         * }else if(week==4)
         * {
         * System.out.println("星期四");  
         * 
         * }else if(week==5)
         * {
         * System.out.println("星期五");  
         * 
         * }else if(week==6)
         * {
         * System.out.println("星期六");  
         * 
         * }else{
         * System.out.println("星期日");  
         * 
         * }
         */
        // 5.switch语句判断星期
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("请输入一个星期数(1-7):");
         * int week = sc.nextInt();
         * 
         * switch(week)
         * {
         * case 1:
         * System.out.println("星期一");  
         * break;
         * case 2:
         * System.out.println("星期二");  
         * break;
         * case 3:
         * System.out.println("星期三");  
         * break;
         * case 4:
         * System.out.println("星期四");  
         * break;
         * case 5:
         * System.out.println("星期五");  
         * break;
         * case 6:
         * System.out.println("星期六");  
         * break;
         * case 7:
         * System.out.println("星期日");  
         * break;
         * default:
         * System.out.println("你输入的星期数有误");  
         * //break;
         * }
         */

        // 6.case 穿透用法
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("请输入一个月份数:");
         * int mouth = sc.nextInt();
         * 
         * switch(mouth)
         * {
         * case 1,2,12: //可以多个用逗号隔开
         * //case 2:
         * // case 12:
         * System.out.println("冬季");  
         * break;
         * case 3:
         * case 4:
         * case 5:
         * System.out.println("春季");  
         * break;
         * case 6:
         * case 7:
         * case 8:
         * System.out.println("夏季"); 
         * break;
         * case 9:
         * case 10:
         * case 11:
         * System.out.println("秋季");
         * break;
         * default:
         * System.out.println("您输入的月份数有误！");  
         * }
         */
        // 1.for循环求1-100偶数之间的和
     /*    int i;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100偶数的和为:"+sum);  */
        
        //2.for循环求水仙花数（个十百位数的立方和相加等于原数，水仙花是一个三位数）
        //步骤 输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
        //在计算之前获取三位数中每个位上的值
        //判定条件是将三位数中的每个数值取出来，计算立方后与原始数字比较是否相等
        //输出满足条件的数字就是水仙花数
        /* for(int i=100;i<1000;i++)
        {
            int ge  = i % 10;
            int shi =i / 10 % 10;
            int bai =i / 100%10;
            if(ge*ge*ge +shi*shi*shi + bai*bai*bai ==i)
            {
             System.out.println(i);  //  输出结果：153 370 371 407

            }
        } */

        //3.统计“水仙花数”一共有多少个，并且在控制台输出
        /* int count=0;
        for(int i=100;i<1000;i++)
        {
            int ge  =i %10;
            int shi =i /10 % 10;
            int bai =i /10 /10 % 10;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i)
            {
                count++; 
            }    
        }
        System.out.println("水仙花的个数"+count+"个");   //输出结果：4
         */


        //4.while循环
        /* for(int i=1;i<6;i++)
        {
            System.out.println("lalisa!");
        }
        int i =1;
        while(i<6)
        {
            System.out.println("rosy!");
            i++;
        } */
        //5.while 折纸案例
      /*   double paper =0.1;
        int count=0;
        while(paper<=8844430)
        {
            paper *=2;
            count++;
        }
        System.out.println("需要折叠的次数"+count+"次"); */
        //6.do...whlie格式
        /* int j =0;
        do
        {
            System.out.println("jisoo!");
            j++;
        }while(j<5);
 */
       /*  //7.break 和continu 的用法
        int i;
        for(i=1;i<5;i++)
        {
            if(i % 2 == 0)
            //break;     //输出结果：2
            continue;    //输出结果：5
        }
        System.out.println(i);
 */
        //8.循环嵌套
        /* for( int hour=0;hour<24;hour++)
        {
            for(int minute =0;minute<60;minute++)
            {
                System.out.println(hour+"时"+minute+"分");
            }
        } */

        //9.Random的作用和使用步骤

       /*  Random r =new Random(); //Random的取值范围【0-99】

        for(int i=0;i<=10;i++)      
        {
            int number=r.nextInt(10);   //不放在for循环里面不然结果是获取一个随机数打印10次，放在for循环里面才能打印十个随机数字
            System.out.println("number:"+number);

        }
        int x =r.nextInt(100)+1;   //范围在【1-100】随机输出一个数字
        System.out.println(x); */

        //10.Random猜数字（程序自动生成1-10之间的数字，使用程序实现猜出这个数字的多少）
        /* 当猜错的时候根据比真实数字大，提示你猜错了
        当猜的数字比真实数字小，提示你猜的数据小了
        如果猜的数字与真实数字相等，提示恭喜你猜的中了 */

        //要完成猜数字游戏，首先需要有一个要猜的数字，使用随机数字，范围1-100
     /*    Random r =new Random();
        int number=r.nextInt(100)+1;

        while (true) //需要用死循环break去终止程序
        {
            //使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘录入实现
            Scanner sc =new Scanner(System.in);

            System.out.println("请输入一个随机数字：");
            int guessNumber =sc.nextInt();

            //比较输入的数字和系统产生的数据，需要使用的分支，这里使用if...else格式，根据不同情况进行猜测结果显示
            if(guessNumber>number)
            {
                System.out.println("您猜的数字大了！");
            }else if(guessNumber<number)
            {
                System.out.println("您猜的数字小了!");
            }else
            {
                System.out.println("恭喜您猜中了！");
                break;
            }
    
        }
    }
   
}
 */