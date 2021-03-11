package lanhan;

public class Singleton {

        //懒汉，线程不安全
        private static Singleton instance;

        private Singleton(){}

        public static Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }

            return instance;
        }
}

