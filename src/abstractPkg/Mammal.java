package abstractPkg;

public abstract class Mammal extends Animal {
    @Override
    final void eat() {
        System.out.println("eating");
    }
    Mammal(){

    }
}
