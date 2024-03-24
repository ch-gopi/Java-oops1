package Inheritence;

public class D  extends  C {
    D(){
        System.out.println("Constructor d got called");
}
    D(String S){
        super("s");
        System.out.println("Constructor d PARAMS got called "+ S);
    }

    C dosomething(){
        System.out.println("DO SOMeTHING");
          return  new C();  }


}
