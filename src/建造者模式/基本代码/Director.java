package 建造者模式.基本代码;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 指挥者类,用来指挥建造过程
 * @author: LongJiangBo
 * @create: 2020-08-06 11:13
 **/
public class Director {
    public void Construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
