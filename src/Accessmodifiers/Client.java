package Accessmodifiers;


import Introtooops.Student;
public class Client {
    public static void main(String[] args){
        Student s =new Student();
        s.age=25;
        //protected cant be used outside the package
        // can only be used if it is child class(i.e using inheritence)
        //s.psp=98;

    }

}
