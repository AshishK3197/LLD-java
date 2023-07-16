package DesignPatterns;

class SingletonEagar {
//    Object is created everytime its called as always initialised.
    private static SingletonEagar instance = new SingletonEagar();

    private SingletonEagar(){}

    public static SingletonEagar getInstance() {
        return instance;
    }
}

class SingletonLazy {
//    mostly used one
//    Object is not created unless needed;
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if(instance == null) {
//            Doing this to make sure its thread safe
            synchronized (SingletonLazy.class){
                if(instance == null)
                    instance = new SingletonLazy();
            }
        }
        return instance;
    }
}

class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){}

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if(instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getInstance() {
        if(instance == null) {
            synchronized (SingletonSynchronized.class) {
                if(instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();

        System.out.println(instance);

        SingletonLazy instance1 = SingletonLazy.getInstance();

        System.out.println(instance1);
    }
}
