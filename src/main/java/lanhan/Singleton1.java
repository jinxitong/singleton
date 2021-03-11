package lanhan;

public class Singleton1 {
    //懒汉式，线程安全的
    private static Singleton1 instance;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }

        return instance;
    }
}
