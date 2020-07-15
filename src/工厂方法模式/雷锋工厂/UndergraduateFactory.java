package 工厂方法模式.雷锋工厂;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 学雷锋的大学生工厂
 * @author: LongJiangBo
 * @create: 2020-07-14 22:13
 **/
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraduate();
    }
}
