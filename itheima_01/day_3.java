package itheima_01;


//1.�������ʼƻ�if��
/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ��������(1-7)��");

        int week = sc.nextInt();

        if (week == 1) {
            System.out.println("��һ���ܲ�");

        } else if (week == 2) {
            System.out.println("�ܶ�����Ӿ");

        } else if (week == 3) {
            System.out.println("����������");

        } else if (week == 4) {
            System.out.println("���ģ����е���");

        } else if (week == 5) {
            System.out.println("���壺ȭ��");

        } else if (week == 6) {
            System.out.println("��������ɽ");

        } else if (week == 7) {
            System.out.println("���գ��Դ��");

        } else {
            System.out.println("���������������");

        }
    }

} */
//2.���ʼƻ�Switch

/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ��������(1-7):");

        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("��һ���ܲ�");
                break;
            case 2:
                System.out.println("�ܶ�����Ӿ");
                break;
            case 3:
                System.out.println("����������");
                break;
            case 4:
                System.out.println("���ģ����е���");
                break;
            case 5:
                System.out.println("���壺ȭ��");
                break;
            case 6:
                System.out.println("��������ɽ");
                break;
            case 7:
                System.out.println("���գ��Դ��");
                break;
            default:
                System.out.println("���������������");
        }

    }
} */
//3.��7�����ڿ���̨��ӡ��1-100֮�������7�ع��Ĺ�������ݣ����������ְ���7������7�ı�����Ҫ������
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
//4.��������(쳲���������)
//��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ��������ʵ�20���µ����Ӷ���Ϊ���٣�
/* public class day_3 {
    public static void main(String[]args){
    //Ϊ�˴洢����µ����Ӷ���������һ�����飬�ö�̬��ʼ���������Ԫ�صĳ�ʼ��������Ϊ20
        int [] arr = new int [20];

    //��Ϊ��һ���£��ڶ��������ӵĶ�������֪�ģ�����1����������ĵ�һ��Ԫ�أ��ڶ���Ԫ��ֵҲ��1
        arr[0]=1;
        arr[1]=1;

    //ѭ��ʵ�ּ���ÿ���µ����Ӷ���

        for(int i =2;i<arr.length;i++)
        {
            arr[i] = arr[i-2]+arr[i-1];
            
        }
    //������������һ��Ԫ�ص�ֵ�����ǵ�20���µ����Ӷ���
    System.out.println("��20���µ�������Ϊ:"+arr[19]); //��20���µ�������Ϊ:6765
    }
} */
//5.��Ǯ�ټ�������һֵǮ�壬��ĸһֵǮ����������ֵǮһ����Ǯ��ټ����ʹ���ĸ���ͼ�������ֻ��
/* public class day_3 {
    public static void main(String[]args){
//��һ��ѭ�������ڱ�ʾ�����ķ�Χ����ʼ�����ʽ�ı�������Ϊ x=0�ж�������x<=20
        for(int x=0;x<=20;x++){
            //�ڶ���ѭ�������ڱ�ʾ��ĸ�ķ�Χ����ʼ�����ʽ�ı�������Ϊy=0�ж���������y<=33
            for(int y =0;y<=33;y++){
                //���ʱ�����ڱ�ʾ���ı��� z=100-x-y
                int z=100-x-y;
                //�жϱ��ʽ z%3==0�ͱ��ʽ 5*x+3*y+z/3=100ͬʱ����
                if(z % 3 ==0 && 5*x+3*y+z/3 == 100 ){
                    System.out.println("x:"+x+","+"y:"+y+","+"z:"+z);
                }
            }
        }
    }
} */
//6.����Ԫ�����
//��һ������Ԫ����{68,27,95,88,171,996,51,210}���������������Ҫ���Ԫ�غͣ�Ҫ���ǣ���͵�Ԫ�ظ�λ��ʮλ��������7������ֻ����ż��
/* public class day_3 {
    public static void main(String[] args) {
        
        
        int[] arr = { 68, 27, 95, 88, 171, 996, 51, 210 };
        int sum = 0;
        //i �ĳ��Ȳ��ܵ�������ĳ���ֻ��С������ĳ��� ���������Խ������
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] % 100 / 10 != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("sum:"+sum);
    }
} */
//7.����������ͬ
//���һ�����������ڱȽ���������������Ƿ���ͬ
//�����������飬�ֱ�ʹ�þ�̬��ʼ���������Ԫ�صĳ�ʼֵ
//����һ�����������ڱȽ���������������Ƿ���ͬ ����ֵ���ͣ�boolean ������int[]arr ,int[]arr2
//���ȱȽ�����ĳ��ȣ�������Ȳ�ͬ���������ݿ϶�����ͬ������false
//��α������Ƚ����������е�ÿһ��Ԫ�أ�ֻҪ��Ԫ�ز���ͬ������false
//���ѭ�����������󣬷���true

/* public class day_3 {
    public static void main(String[] args) {
        // ��������//����һ�����������ڱȽ���������������Ƿ���ͬ ����ֵ���ͣ�boolean ������int[]arr
        // ,int[]arr2���飬�ֱ�ʹ�þ�̬��ʼ���������Ԫ�صĳ�ʼֵ
        int[] arr = { 11, 22, 33, 44, 55 };
        int[] arr2 = { 11, 22, 33, 44, 5 };
        // ���÷���
        boolean flag = compare(arr, arr2);
        System.out.println(flag);
        // ����һ�����������ڱȽ���������������Ƿ���ͬ ����ֵ���ͣ�boolean ������int[]arr ,int[]arr2
    }

    public static boolean compare(int[] arr, int[] arr2) {
        // ���ȱȽ�����ĳ��ȣ�������Ȳ�ͬ���������ݿ϶�����ͬ������false
        if (arr.length != arr2.length) {
            return false;
        }
        // ��α������Ƚ����������е�ÿһ��Ԫ�أ�ֻҪ��Ԫ�ز���ͬ������false

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        // ���ѭ����������������true
        return true;
    }

} */
//8.��֪һ������arr={19,28,37,46,50}������¼��һ�����ݣ����Ҹ������������е����������ڿ���̨����ҵ�������ֵ
/* ����һ�����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
����¼��Ҫ���ҵ����ݣ���һ����������
����һ��������������ʼֵΪ-1
�������飬��ȡ�������е�ÿһ��Ԫ��
�ü���¼������ݺ������е�ÿһ��Ԫ�ؽ��бȽϣ����ֵ��ͬ���͸ðѶ�Ӧ��������ֵ������������������ѭ��
����������� */
/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        // ����һ�����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��

        int[] arr = { 19, 28, 37, 46, 50 };
        // ����¼��Ҫ���ҵ����ݣ���һ����������
        Scanner sc = new Scanner(System.in);

        System.out.println("������Ҫ���ҵ�����:");

        int number = sc.nextInt();
        // ����һ��������������ʼֵΪ-1
        //int index = -1;

        // for (int i = 0; i < arr.length; i++)

        //{
        //  if (arr[i] == number)  
        //  {
        //     index = i;
        //     break;
        //  }
        //} 
        //���÷���
        //   int index = getIndex(arr, number);
        //  �����������
        //  System.out.println("index:"+index);
        //}


        //����һ��˼·��һ������
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
//9.��ת
/* public class day_3 {
    public static void main(String[] args) {
        int[] arr = { 19, 28, 37, 46, 50 };

        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        // ���÷���
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        System.out.print("[");
        // ��סfor������������
        for (int i = 0; i < arr.length; i++) {
            // if�ж���boolean�� ��==����=
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
//10.��ί���
/* �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ��4����ίƽ��ֵ��������С�����֣��� */
//����һ�����飬�ö�̬���������Ԫ�صĳ�ʼ��������Ϊ6
//����¼����ί����
//������6����ί��֣����ԣ�������ί�����Ĳ�������ѭ���Ľ�
 //����һ������ʵ�ֻ�ȡ�����е���߷֣��������ֵ�������÷���
//����һ������ʵ�ֻ�ȡ�����е���ͷ֣�������Сֵ�������÷���
//����һ������ʵ�ֻ�ȡ�����е�����Ԫ�صĺͣ�����Ԫ����ͣ������÷���
//���ռ������������ƽ����
//���ƽ����
/* import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
        // ����һ�����飬�ö�̬���������Ԫ�صĳ�ʼ��������Ϊ6
        int[] arr = new int[6];
        // ����¼����ί����
        Scanner sc = new Scanner(System.in);

        // ������6����ί��֣����ԣ�������ί�����Ĳ�������ѭ���Ľ�
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("�������"+(i+1)+"����ί��֣�");
            arr[i] = sc.nextInt();
        }
        //�������ֵ
        System.out.println("���ֵΪ��"+getMax(arr));
        //������Сֵ
        System.out.println("��СֵΪ��"+getMin(arr));
        //�����������
        System.out.println("����Ԫ�صĺ�Ϊ��"+getSum(arr));
        //���ռ������������ƽ����
        int max =getMax(arr);
        int min=getMin(arr);
        int sum=getSum(arr);
        int avg =(sum-min-max)+(arr.length-2)/4;
        //���ƽ����
        System.out.println("ѡ�ֵ�ƽ����Ϊ��"+avg);




    }
    //����һ������ʵ�ֻ�ȡ�����е���߷֣��������ֵ�������÷���
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
      //����һ������ʵ�ֻ�ȡ�����е���ͷ֣�������Сֵ�������÷���
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
    //����һ������ʵ�ֻ�ȡ�����е�����Ԫ�صĺͣ�����Ԫ����ͣ������÷���
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
//11.��Ķ����ʹ��
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
        System.out.println("��绰!");
}
public void sendMessage()
{
        System.out.println("����Ϣ!");
}

} */