package 适配器模式.篮球翻译适配器;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 中锋类
 * @author: LongJiangBo
 * @create: 2020-08-31 22:12
 **/
public class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.printf("中锋{0}进攻",name);
    }

    @Override
    public void Defense() {
        System.out.printf("中锋{0}防守",name);
    }
}
