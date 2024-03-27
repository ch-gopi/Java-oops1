package abstractPkg;

public class Dog extends Mammal  {
    public static int y=10;
    int z = 0;
     int m=15;
    void dosomething(){
        System.out.println(y);
        //m=m*10; final varible can't be assigned or changed value
        System.out.println(m*10);}
    static  void test(){
        System.out.println(y);
     //   System.out.println(z);//non-static members cant be accessed  in static methods (java: non-static variable z cannot be referenced from a static context)
    }
    //void eat(){

    }
    Dog(){
            y+=1;
            z+=1;

    }

}
