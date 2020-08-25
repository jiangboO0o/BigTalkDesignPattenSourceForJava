package 单例模式.多线程;

import 单例模式.模板.Singleton;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 懒汉式
 * 要在第一次被引用时，才会将自己实例化，所以就被称为懒汉式单例类
 * @author: LongJiangBo
 * @create: 2020-08-24 22:12
 **/
public class Singleton1 {
    private static Singleton1 singleton1 = null;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (null == singleton1){
            synchronized (Singleton1.class){
                if (null == singleton1){
                    return singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
