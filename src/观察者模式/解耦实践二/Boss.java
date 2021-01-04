package 观察者模式.解耦实践二;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 老板类
 * @author: LongJiangBo
 * @create: 2020-08-11 22:04
 **/
public class Boss extends Subject {

    //同事列表
    private List<Observer> observers = new ArrayList<>();

    private String action;

    //绑定观察者
    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    //解绑观察者
    @Override
    public void Detach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Notify() {
        for (Observer item : observers) {
            item.Update();
        }
    }

    //老板状态
    @Override
    public String getSubjectState() {
        return super.getSubjectState();
    }
    @Override
    public void setSubjectState(String subjectState) {
        super.setSubjectState(subjectState);
    }
}
