package 适配器模式.篮球翻译适配器;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 翻译者类
 * @author: LongJiangBo
 * @create: 2020-08-31 22:22
 **/
public class Translator extends Player {
    //声明一个外籍中锋，用于关联翻译者
    private ForeignCenter wjzf = new ForeignCenter();
    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void Attack() {
        wjzf.进攻();
    }

    //重写Defense方法为防守（）方法。相当于翻译了一下。
    @Override
    public void Defense() {
        wjzf.防守();
    }
}
