package Inheritence;

public class C extends  B{
    C(){
        super("abc");
        System.out.println("Constructor c got called");
}

    C(String S){
        this();
<<<<<<< HEAD
        System.out.println("Constructor C PARAMS got called  "+S);
=======
        System.out.println("Constructor C PARAMS got called "+S);
>>>>>>> origin/master
    }          }
