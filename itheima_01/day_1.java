package itheima_01;

//public class day_1 {
//public static void main(String[] args) {
/*
 * // System.out.println("�������Ա");
 * // System.out.println("hello world");
 * 
 * // 1.�������
 * int a = 10;
 * // System.out.println(a);
 * 
 * a = 20;
 * System.out.println(a); // 20
 * 
 * // 2.����ʹ�õ�ע������
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
 * System.out.println(o); // true //�����������ظ�ʹ��
 * 
 * // ����long���͵ı���
 * long l = 10000000000000l; // ϵͳĬ�ϵ�������int���� Ϊ�˷�ֹ�������󣬺���Ҫ��L
 * System.out.println(l);
 * 
 * // ����float���͵ı���
 * float f = 13.14f;
 * System.out.println(f); // flaot���͵ı��������ʱ��Ϊ�˷�ֹ���Ͳ����ݣ�����Ҫ��F
 * 
 * // 3.�Զ�����ת��
 * double x =10;
 * System.out.println(x);//10.0
 * 
 * //����byteleix�ı���
 * byte z =10;
 * short v=b;
 * int i=b;
 * //char n=b; //char���Ͳ����ݲ����Զ�ת��
 * 
 * System.out.println(i);//10
 * 
 * //4.ǿ������ת��
 * //int k=88.88;
 * int k =(int)88.88; //������������ݵĶ�ʧ
 * System.out.println(k);
 * //5.���������
 * int p =6;
 * int q =4;
 * System.out.println(p+q);
 * System.out.println(p-q);
 * System.out.println(p*q);
 * System.out.println(p/q);
 * System.out.println(p%q); //�����õ������̣�ȡ��õ���������
 * 
 * System.out.println(6.0/4);//�������ֻ�ܵõ���������Ҫ�õ�С���������и������Ĳ���
 */
/*
 * // 6.�ַ��ġ�+������
 * int i = 10;
 * char c = 'A'; // A 65 A-Z����
 * // c = 'a'; //a 97 a-z����
 * // c = '0'; //0 48 0-9����
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
/*   // 7.�߼������
  int i = 10;
  int j = 20;
  int k = 30;

  System.out.println((i > j) & (i < k)); // a��b������ Ϊtrue
  System.out.println((i > j) | (i < k)); // ��һ��Ϊ�� Ϊtrue
  System.out.println((i > j) ^ (i < k)); // a��b�����ͬΪfalse��ͬΪtrue
  System.out.println(!(i > j)); // �����a�Ľ�������෴
  System.out.println("---------------");

  // 8.��·�߼�����
  // System.out.println((i++ > 100) & (j++ > 100));
  System.out.println((i++ > 100) && (j++ > 100));
  System.out.println("i:" + i);
  System.out.println("j:" + j);
  System.out.println("---------------");
*/
/* // 9.��Ԫ���������һ
int weight1 = 100;
int weight2 = 200;

boolean b = weight1 > weight2 ? true : false;
System.out.println("b:" + b);
System.out.println("---------------");

// 10.��Ԫ�����������

int weight3 = 100;
int weight4 = 200;
int weight5 = 300;

int tempHeight = weight3 > weight4 ? weight3 : weight4;
int maxHeight = tempHeight > weight5 ? tempHeight : weight5;
System.out.println("maxHeight" + maxHeight); */

//}
//}

//����
//import java.util.Scanner;
//import java.util.Random;
//public class day_1 {
  //  public static void main(String[] args) {
        /*
         * //1.��������
         * // ��������
         * Scanner sc = new Scanner(System.in);
         * // ��������
         * int x = sc.nextInt();
         * // �������
         * System.out.println("x:" + x);
         */

        // 2.�������б�����û�����
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * 
         * System.out.println("�������һ�����е���ߣ�");
         * int height1 = sc.nextInt();
         * 
         * System.out.println("������ڶ������е���ߣ�");
         * int height2 = sc.nextInt();
         * 
         * System.out.println("��������������е���ߣ�");
         * int height3 = sc.nextInt();
         * 
         * int tempHeight = height1 > height2 ? height1 : height2;
         * int maxHeight = tempHeight > height3 ? tempHeight : height3;
         * 
         * System.out.println("������������ߵ����Ϊ:" + maxHeight); */
         

        // 3.if �������ż��

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("������һ��������");
         * int i = sc.nextInt();
         * 
         * if (i % 2 == 0) {
         * System.out.println("����Ϊż����"+i);  
         * } else {
         * System.out.println("����Ϊ������"+i);  
         * 
         * }
         */
        // 4.if...else ����ж�����

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("������һ��������(1-7):");
         * int week = sc.nextInt();
         * 
         * if(week==1)
         * {
         * System.out.println("����һ"); 
         * 
         * }else if(week==2)
         * {
         * System.out.println("���ڶ�");  
         * 
         * }else if(week==3)
         * {
         * System.out.println("������");  
         * 
         * }else if(week==4)
         * {
         * System.out.println("������");  
         * 
         * }else if(week==5)
         * {
         * System.out.println("������");  
         * 
         * }else if(week==6)
         * {
         * System.out.println("������");  
         * 
         * }else{
         * System.out.println("������");  
         * 
         * }
         */
        // 5.switch����ж�����
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("������һ��������(1-7):");
         * int week = sc.nextInt();
         * 
         * switch(week)
         * {
         * case 1:
         * System.out.println("����һ");  
         * break;
         * case 2:
         * System.out.println("���ڶ�");  
         * break;
         * case 3:
         * System.out.println("������");  
         * break;
         * case 4:
         * System.out.println("������");  
         * break;
         * case 5:
         * System.out.println("������");  
         * break;
         * case 6:
         * System.out.println("������");  
         * break;
         * case 7:
         * System.out.println("������");  
         * break;
         * default:
         * System.out.println("�����������������");  
         * //break;
         * }
         */

        // 6.case ��͸�÷�
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("������һ���·���:");
         * int mouth = sc.nextInt();
         * 
         * switch(mouth)
         * {
         * case 1,2,12: //���Զ���ö��Ÿ���
         * //case 2:
         * // case 12:
         * System.out.println("����");  
         * break;
         * case 3:
         * case 4:
         * case 5:
         * System.out.println("����");  
         * break;
         * case 6:
         * case 7:
         * case 8:
         * System.out.println("�ļ�"); 
         * break;
         * case 9:
         * case 10:
         * case 11:
         * System.out.println("�＾");
         * break;
         * default:
         * System.out.println("��������·�������");  
         * }
         */
        // 1.forѭ����1-100ż��֮��ĺ�
     /*    int i;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100ż���ĺ�Ϊ:"+sum);  */
        
        //2.forѭ����ˮ�ɻ�������ʮ��λ������������ӵ���ԭ����ˮ�ɻ���һ����λ����
        //���� ������е�ˮ�ɻ�����ȻҪʹ�õ�ѭ�����������е���λ������λ����100��ʼ����999����
        //�ڼ���֮ǰ��ȡ��λ����ÿ��λ�ϵ�ֵ
        //�ж������ǽ���λ���е�ÿ����ֵȡ������������������ԭʼ���ֱȽ��Ƿ����
        //����������������־���ˮ�ɻ���
        /* for(int i=100;i<1000;i++)
        {
            int ge  = i % 10;
            int shi =i / 10 % 10;
            int bai =i / 100%10;
            if(ge*ge*ge +shi*shi*shi + bai*bai*bai ==i)
            {
             System.out.println(i);  //  ��������153 370 371 407

            }
        } */

        //3.ͳ�ơ�ˮ�ɻ�����һ���ж��ٸ��������ڿ���̨���
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
        System.out.println("ˮ�ɻ��ĸ���"+count+"��");   //��������4
         */


        //4.whileѭ��
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
        //5.while ��ֽ����
      /*   double paper =0.1;
        int count=0;
        while(paper<=8844430)
        {
            paper *=2;
            count++;
        }
        System.out.println("��Ҫ�۵��Ĵ���"+count+"��"); */
        //6.do...whlie��ʽ
        /* int j =0;
        do
        {
            System.out.println("jisoo!");
            j++;
        }while(j<5);
 */
       /*  //7.break ��continu ���÷�
        int i;
        for(i=1;i<5;i++)
        {
            if(i % 2 == 0)
            //break;     //��������2
            continue;    //��������5
        }
        System.out.println(i);
 */
        //8.ѭ��Ƕ��
        /* for( int hour=0;hour<24;hour++)
        {
            for(int minute =0;minute<60;minute++)
            {
                System.out.println(hour+"ʱ"+minute+"��");
            }
        } */

        //9.Random�����ú�ʹ�ò���

       /*  Random r =new Random(); //Random��ȡֵ��Χ��0-99��

        for(int i=0;i<=10;i++)      
        {
            int number=r.nextInt(10);   //������forѭ�����治Ȼ����ǻ�ȡһ���������ӡ10�Σ�����forѭ��������ܴ�ӡʮ���������
            System.out.println("number:"+number);

        }
        int x =r.nextInt(100)+1;   //��Χ�ڡ�1-100��������һ������
        System.out.println(x); */

        //10.Random�����֣������Զ�����1-10֮������֣�ʹ�ó���ʵ�ֲ³�������ֵĶ��٣�
        /* ���´��ʱ����ݱ���ʵ���ִ���ʾ��´���
        ���µ����ֱ���ʵ����С����ʾ��µ�����С��
        ����µ���������ʵ������ȣ���ʾ��ϲ��µ����� */

        //Ҫ��ɲ�������Ϸ��������Ҫ��һ��Ҫ�µ����֣�ʹ��������֣���Χ1-100
     /*    Random r =new Random();
        int number=r.nextInt(100)+1;

        while (true) //��Ҫ����ѭ��breakȥ��ֹ����
        {
            //ʹ�ó���ʵ�ֲ����֣�ÿ�ξ�Ҫ����²������ֵ����Ҫʹ�ü���¼��ʵ��
            Scanner sc =new Scanner(System.in);

            System.out.println("������һ��������֣�");
            int guessNumber =sc.nextInt();

            //�Ƚ���������ֺ�ϵͳ���������ݣ���Ҫʹ�õķ�֧������ʹ��if...else��ʽ�����ݲ�ͬ������в²�����ʾ
            if(guessNumber>number)
            {
                System.out.println("���µ����ִ��ˣ�");
            }else if(guessNumber<number)
            {
                System.out.println("���µ�����С��!");
            }else
            {
                System.out.println("��ϲ�������ˣ�");
                break;
            }
    
        }
    }
   
}
 */