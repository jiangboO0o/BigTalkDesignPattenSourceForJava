package 简单工厂模式.计算器.Operation;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 加减乘除类，继承运算类
 * @author: LongJiangBo
 * @create: 2020-05-21 10:29
 **/
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
