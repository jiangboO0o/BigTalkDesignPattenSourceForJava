package 策略模式.Cash.商场促销;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 封装了具体的算法或行为，继承于Strategy
 * @author: LongJiangBo
 * @create: 2020-05-26 11:25
 **/
public class ConcreteStrategyC extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C实现");
    }
}