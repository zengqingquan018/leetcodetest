package main.java.learn.singleton;

/**
 * 描述饱汉模式2 线程安全 效率搞 但是可能出现部分初始化
 *
 * @author zengqingquan
 * @date 2021/4/27 13:17
 */
public class Singleton3 {

    private static Singleton3 instance;
    public int f1 = 1;
    public int f2 = 2;
    private Singleton3() {
    }

    public Singleton3 getSingleton() {
        if (instance == null) {
            synchronized (Singleton3.class){
                if (instance==null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
