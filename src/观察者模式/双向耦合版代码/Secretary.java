package 观察者模式.双向耦合版代码;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 前台秘书类
 * @author: LongJiangBo
 * @create: 2020-08-10 21:04
 **/
public class Secretary {
    //同事列表
    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    /**
     * @Description: 增加同事
     * 有几个同事需要前台小姐姐帮忙就添加几个同事到同事列表
     * @Author: LongJiangBo
     * @param observer
     * @return: void
     * @Date: 21:19 2020/8/10
    */
    public void Attach(StockObserver observer){
        observers.add(observer);
    }

    /**
     * @Description: 通知
     * 待老板来时，给所有登记的同事发消息，“老板来了”
     * @Author: LongJiangBo
     * @param
     * @return: void
     * @Date: 21:19 2020/8/10
    */
    public void Notify(){
        for (StockObserver item: observers) {
            item.Update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
