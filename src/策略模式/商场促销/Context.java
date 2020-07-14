package 策略模式.商场促销;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 * @author: LongJiangBo
 * @create: 2020-05-26 11:30
 **/
public class Context {
    Strategy strategy;

    /**
     * @Description: 构造函数，初始化时，传入具体的策略对象
     * @Author: LongJiangBo
     * @param strategy
     * @return:
     * @Date: 11:33 2020/5/26
    */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //上下文接口
    /**
     * @Description: 上下文接口，根据具体的策略对象，调用其算法的方法
     * @Author: LongJiangBo
     * @param
     * @return: void
     * @Date: 11:34 2020/5/26
    */
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
