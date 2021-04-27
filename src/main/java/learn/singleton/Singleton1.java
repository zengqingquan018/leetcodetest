package main.java.learn.singleton;

/**
 * 描述饱汉模式 最基础 线程不安全
 *
 * @author zengqingquan
 * @date 2021/4/27 13:17
 */
public class Singleton1 {

    private static  Singleton1 instance;

    private Singleton1() {
    }

    public Singleton1 getSingleton() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
