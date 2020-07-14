package 简单工厂模式.计算器.Operation;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 减法类，继承运算类
 * @author: LongJiangBo
 * @create: 2020-05-21 10:51
 **/
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
