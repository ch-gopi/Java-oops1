package Constructors;

public class Client {
    public static void main(String[] args){
      Student s = new Student();
      Student s1=new Student(6,"gopi");
      Student s2=s1;
      Student s3 =new Student(s1);
      s3.exam.exam_id =  100;
      System.out.println(s);
    }
}
