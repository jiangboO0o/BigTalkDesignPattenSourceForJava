package 建造者模式.建造小人;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 瘦的小人
 * @author: LongJiangBo
 * @create: 2020-07-29 11:00
 **/
public class PersonThinBuilder extends PersonBuilder{
    @Override
    public void BuildHead() {
        System.out.println("我是头");
    }

    @Override
    public void BuildBody() {
        System.out.println("我是身体");
    }

    @Override
    public void BuildArmLeft() {
        System.out.println("我是左胳膊");
    }

    @Override
    public void BuildArmRight() {
        System.out.println("我是右胳膊");
    }

    @Override
    public void BuildLegLeft() {
        System.out.println("我是左腿");
    }

    @Override
    public void BuildLegRight() {
        System.out.println("我是右腿");
    }
}
