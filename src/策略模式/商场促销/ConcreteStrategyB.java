package 策略模式.商场促销;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 封装了具体的算法或行为，继承于Strategy
 * @author: LongJiangBo
 * @create: 2020-05-26 11:25
 **/
public class ConcreteStrategyB extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B实现");
    }
}
