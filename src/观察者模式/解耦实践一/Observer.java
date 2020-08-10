package 观察者模式.解耦实践一;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 抽象的观察者
 * @author: LongJiangBo
 * @create: 2020-08-10 21:37
 **/
public abstract class Observer {

    //保护类型，子类可以用，外部不可以用。
    protected String name;
    protected Secretary secretary;

    //构造函数
    public Observer(String name,Secretary secretary){
        this.name = name;
        this.secretary = secretary;
    }

    //抽象的更新方法
    public abstract void Update();
}
