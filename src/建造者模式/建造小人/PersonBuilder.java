package 建造者模式.建造小人;

import java.awt.*;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 抽象的建造人的类
 * @author: LongJiangBo
 * @create: 2020-07-29 10:23
 **/
public abstract class PersonBuilder {

    //头
    public abstract void BuildHead();
    //身体
    public abstract void BuildBody();
    //左臂
    public abstract void BuildArmLeft();
    //右臂
    public abstract void BuildArmRight();
    //左腿
    public abstract void BuildLegLeft();
    //右腿
    public abstract void BuildLegRight();
}
