package 观察者模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端代码
 * @author: Mr.Wang
 * @create: 2020-08-15 16:29
 **/
public class main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();

        s.Attach(new ConcreteObserver(s, "X"));
        s.Attach(new ConcreteObserver(s, "Y"));
        s.Attach(new ConcreteObserver(s, "Z"));
        s.setSubjectState("ABC");
        s.Notify();
    }
}
