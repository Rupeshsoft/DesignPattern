import java.util.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        Singleton object1 = null;
      
        try{
            Constructor<Singleton> construct =Singleton.class.getDeclaredConstructor();
        construct.setAccessible(true);
        object1 = construct.newInstance();
        System.out.println(object.hashCode());
        System.out.println(object1.hashCode());
      
        } catch(NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e ){
            e.printStackTrace();
        }
        
    }
}
