package 观察者模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 抽象观察者类
 * 为所有的具体观察者定义一个借口，在得到主题的通知时更新自己。这个借口叫做更新接口。抽象观察者一般用一个抽象类或者一个接口实现。更新接口通常包含一个Update()方法。这个方法叫做更新方法。
 * @author: Mr.Wang
 * @create: 2020-08-12 17:56
 **/
public abstract class Observer {
    public abstract void Update();
}
