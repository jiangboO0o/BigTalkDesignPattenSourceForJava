package 观察者模式.解耦实践二;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 抽象观察者类
 * @author: LongJiangBo
 * @create: 2020-08-11 22:06
 **/
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public abstract void Update();
}