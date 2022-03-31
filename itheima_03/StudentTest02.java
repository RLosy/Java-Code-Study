//package itheima_03;
public class StudentTest02 {
     public static void main(String[] args) {
         Student1 s3 = new Student1();

         s3.name="lalisa";
         s3.age=20;

         System.out.println(s3.name+","+s3.age);

         Student1 s4 =s3;
         s4.name="rosy";
         s4.age=23;
         System.out.println(s3.name+","+s3.age);

         System.out.println(s4.name+","+s4.age);


     }
}
