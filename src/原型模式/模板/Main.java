package 原型模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端代码
 * @author: LongJiangBo
 * @create: 2020-07-15 22:15
 **/
public class Main {
    public static void main(String[] args) {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = null;
        try {
            //克隆类 ConcretePrototype1的对象p1就能得到新的实例c1
            c1 = (ConcretePrototype1) p1.Clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(c1.getId());
    }
}
