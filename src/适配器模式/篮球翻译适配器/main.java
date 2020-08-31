package 适配器模式.篮球翻译适配器;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端代码
 * @author: LongJiangBo
 * @create: 2020-08-31 22:14
 **/
public class main {
    public static void main(String[] args) {
        Player b = new Forwards("B");
        b.Attack();
        Player m = new Guards("M");
        m.Attack();

        Player ym = new Translator("YM");
        ym.Attack();
        ym.Defense();
    }
}
