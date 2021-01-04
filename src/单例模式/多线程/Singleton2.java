package 单例模式.多线程;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 饿汉式
 * 这种静态初始化的方式是在自己被加载时就将自己实例化，所以被形象地称之为饿汉式单例类
 * @author: LongJiangBo
 * @create: 2020-08-25 22:30
 **/
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
