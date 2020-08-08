package 建造者模式.基本代码;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端代码，客户端不需要知道具体的建造过程
 * @author: LongJiangBo
 * @create: 2020-08-06 11:14
 **/
public class main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.Show();

        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.Show();
    }
}
