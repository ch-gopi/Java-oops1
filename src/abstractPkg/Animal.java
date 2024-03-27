package abstractPkg;

public abstract class Animal {
    String name;
    int age;


    void printName() {
        System.out.println(this.name);

    }

    abstract void eat();

    Animal(String name) {

      this.name =name;
    }
    Animal(){

    }}
    //Animal a=new Animal(); abstract class can't create object



