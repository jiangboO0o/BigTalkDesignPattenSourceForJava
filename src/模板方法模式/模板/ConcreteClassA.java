package 模板方法模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 实现类
 * @author: LongJiangBo
 * @create: 2020-07-22 21:46
 **/
public class ConcreteClassA extends AbstractClass {

    //和B不同的方法实现
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }
    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
