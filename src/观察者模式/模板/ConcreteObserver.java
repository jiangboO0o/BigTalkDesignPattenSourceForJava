package 观察者模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 具体观察者
 * 实现抽象观察者角色锁要求的更新将接口以便使本身的状态与主题的状态相协调。具体观察者角色可以保存一个指向具体主题对象的引用。具体观察者角色通常用一个具体子类实现。
 * @author: Mr.Wang
 * @create: 2020-08-15 16:02
 **/
public class ConcreteObserver extends Observer {
    //姓名
    private String name;
    //观察者状态
    private String observerState;
    //具体观察者
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void Update() {
        observerState = subject.getSubjectState();
        System.out.printf("观察者{0}的新状态是{1}", name, observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
