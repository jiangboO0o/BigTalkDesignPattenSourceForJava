package 观察者模式.双向耦合版代码;

import java.text.MessageFormat;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 看股票的同事类
 * @author: LongJiangBo
 * @create: 2020-08-10 21:05
 **/
public class StockObserver {

    //同事姓名
    private String name;
    //给他报信的秘书
    private Secretary secretary;

    //构造函数
    public StockObserver(String name, Secretary secretary){
        this.name = name;
        this.secretary = secretary;
    }

    /**
     * @Description: 收到前台通知时，采取的行动
     * @Author: LongJiangBo
     * @param
     * @return: void
     * @Date: 21:25 2020/8/10
    */
    public void Update(){
        System.out.println(MessageFormat.format("{0} {1} 关闭骨片行情，继续工作！",secretary.getAction(),name));
    }
}
