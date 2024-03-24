package Inheritence;

public class main {
    //static void setPassword(User u){
    //    u.password="password";
    //}
    public static void main(String[] args){
        Student s=new Student();
            System.out.println(s);
            D d=new D("S");
            System.out.println(d);
            //POLYMORPHISM
            User s2=new Student();
          //  s2.dosomething(); not allowed with parents reference to access child's thing...
            System.out.println(s2);
           // Student s3=new User();All users are not students
        // User cannot be converted to student
        //Student s3= new Student();
        //setPassword(new Student());
        // method overloading
        C c=new C();
        c.dosomething();
        c.dosomething("ad");
        c.dosomething ("ad",4);
        c.dosomething(4,"sdf");
//method overriding
        D d1=new D();
        d1.dosomething();
        d1.dosomething ("ad",4);


    }
}
