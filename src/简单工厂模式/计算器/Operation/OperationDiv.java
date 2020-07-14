package 简单工厂模式.计算器.Operation;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 除法类，继承运算类
 * @author: LongJiangBo
 * @create: 2020-05-21 10:57
 **/
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
