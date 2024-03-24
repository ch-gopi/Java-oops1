package Inheritence;

public class C extends  B{
    C(){
        super("abc");
        System.out.println("Constructor c got called");
}

    C(String S){
        this();
        System.out.println("Constructor C PARAMS got called"+S);

    }
     B dosomething(){
        System.out.println("DO SOMeTHING with c got called");
         return  new B(" ");     }
    void dosomething(String s){
        System.out.println("DO SOMRTHING");
    }
    void dosomething( String Z,int X){
        System.out.println("DO SOMRTHING with c got called");
    }
    void dosomething(int x,String z){
        System.out.println("DO SOMRTHING");
    }
}
