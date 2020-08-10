package 观察者模式.解耦实践一;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 前台秘书类
 * @author: LongJiangBo
 * @create: 2020-08-10 21:39
 **/
public class Secretary {

    //同事列表
    private List<Observer> observers = new ArrayList<>();

    //前台秘书当前状态，即刚刚做了什么动作
    private String action;

    //增加同事,绑定关系，传入参数为抽象类，与具体类解耦
    public void Attach(Observer observer){
        observers.add(observer);
    }

    //与同事解绑
public void Detach(Observer observer){
        observers.remove(observer);
}



    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
