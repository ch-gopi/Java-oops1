package Introtooops;

public class Client {
    public static void main(String[] args){
        Student st1=new Student();
        System.out.println(st1);
        st1.setId (1234);
        System.out.println(st1.getId());
        st1.name="gopi";
        st1.psp= 96.0;
        st1.age=28;
        st1.gradYear=2018;
        st1.print();
    }
}
