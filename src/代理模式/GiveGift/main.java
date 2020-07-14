package 代理模式.GiveGift;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 使用代码
 * @author: LongJiangBo
 * @create: 2020-07-10 11:03
 **/
public class main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
