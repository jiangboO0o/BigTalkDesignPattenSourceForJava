package 适配器模式.篮球翻译适配器;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 前锋类
 * @author: LongJiangBo
 * @create: 2020-08-31 21:55
 **/
public class Forwards extends Player {

    public Forwards(String name){
        super(name);
    }

    @Override
    public void Attack() {
        System.out.printf("前锋{0}进攻",name);
    }

    @Override
    public void Defense() {
        System.out.printf("前锋{0}防守",name);
    }
}
