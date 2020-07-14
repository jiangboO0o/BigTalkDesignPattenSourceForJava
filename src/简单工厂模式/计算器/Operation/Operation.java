package 简单工厂模式.计算器.Operation;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description:
 * @author: LongJiangBo
 * @create: 2020-05-21 10:26
 **/
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
