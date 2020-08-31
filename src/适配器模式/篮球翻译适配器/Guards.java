package 适配器模式.篮球翻译适配器;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 后卫类
 * @author: LongJiangBo
 * @create: 2020-08-31 22:13
 **/
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.printf("后卫{0}进攻",name);
    }

    @Override
    public void Defense() {
        System.out.printf("后卫{0}防守",name);
    }
}
