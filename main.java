// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Singleton{
    private static Singleton instance = null; 
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null ){
            instance = new Singleton();
        }
        
        return instance;
    }
}

class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Singleton object = Singleton.getInstance();
        Singleton object1 = Singleton.getInstance();
        
        System.out.println(object.hashCode());
        System.out.println(object1.hashCode());
        
    }
}
