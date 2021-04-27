package main.java.learn.singleton;

/**
 * 饿汉模式
 *
 * @author zengqingquan
 * @date 2021/4/27 13:17
 */
public class Singleton6 {
    private static  class  SingletonHolder{
        private static final Singleton6 instance = new Singleton6();
        private SingletonHolder() {
        }
    }
    private Singleton6() {
    }

    public Singleton6 getSingleton5(){
        return SingletonHolder.instance;
    }

}
