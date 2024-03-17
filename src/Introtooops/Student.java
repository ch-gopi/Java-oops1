package Introtooops;

public class Student {
    private int id;
    String name;
    protected double psp;
    public int age;
    int gradYear;
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

    int getId() {
        return id;
    }
}
