package 模板方法模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 实现类
 * @author: LongJiangBo
 * @create: 2020-07-22 22:16
 **/
public class ConcreteClassB extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
