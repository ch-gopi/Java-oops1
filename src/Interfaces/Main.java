package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<runner> runningAnimals=new ArrayList<>();
        Dog d=new Dog();
        Bat b=new Bat();
        Mammal m=new Mammal();
        runningAnimals.add(d);
       // runningAnimals.add(m);
       // runningAnimals.add(b);
        for (runner anm:runningAnimals){
            anm.run();
        }
    }
}
