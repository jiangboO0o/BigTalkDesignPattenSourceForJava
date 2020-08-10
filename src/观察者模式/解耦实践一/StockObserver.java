package 观察者模式.解耦实践一;

import java.text.MessageFormat;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 具体观察者1
 * @author: LongJiangBo
 * @create: 2020-08-10 21:44
 **/
public class StockObserver extends Observer {



    @Override
    public void Update() {
        System.out.println(MessageFormat.format("{0} {01} 关闭股票行情，继续工作！");
    }
}
