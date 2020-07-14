package 简单工厂模式.计算器.Operation;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 乘法类，继承运算类
 * @author: LongJiangBo
 * @create: 2020-05-21 10:54
 **/
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
