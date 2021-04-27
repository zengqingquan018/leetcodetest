package main.java.learn.singleton;

/**
 * 描述饱汉模式4 线程安全 效率高
 *
 * @author zengqingquan
 * @date 2021/4/27 13:17
 */
public class Singleton4 {

    private volatile static Singleton4 instance;
    public int f1 = 1;
    public int f2 = 2;
    private Singleton4() {
    }

    public Singleton4 getSingleton() {
        if (instance == null) {
            synchronized (Singleton4.class){
                if (instance==null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
