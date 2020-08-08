package 建造者模式.基本代码;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 抽象建造者类
 * @author: LongJiangBo
 * @create: 2020-08-06 11:00
 **/
abstract class Builder {
    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();
}
