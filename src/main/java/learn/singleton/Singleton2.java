package main.java.learn.singleton;

/**
 * 描述饱汉模式1 最基础 线程安全 但是效率低
 *
 * @author zengqingquan
 * @date 2021/4/27 13:17
 */
public class Singleton2 {

    private static  Singleton2 instance;

    private Singleton2() {
    }

    public synchronized  Singleton2 getSingleton() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
