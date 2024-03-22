package Constructors;

public class Student {
    private int id;
    String name;
    protected double psp;
    public int age;
    int gradYear;
    Exam exam;
    void print(){
        System.out.println("Introtooops.Student:"+name+" with psp:"+psp+" and age:"+age+"and id is :"+id);
    }
    void attendClass(){
        System.out.println("attending classes");

    }
    void setId(int x){
        if(x<0){
            throw new RuntimeException("id is invalid");
        }
        id=x;
    }
    Student(Student other){
        this.id=other.id;
        this.name=other.name;
        this.psp=other.psp;
        this.age=other.age;
    //    this.exam=other.exam;
     //   this.exam=new Exam(other.exam.exam_id);
         this.exam=new Exam(other.exam);
    }
    Student(){
        this.id =5;
        this.name="something";
        this.psp=98;
        this.age=99;
        this.exam=new Exam(30);

    }
    Student(int id,String name){
        this.id=id;
        this.name=name;
        this.exam=new Exam(40);
    }

    int getId() {
        return id;
    }
}
