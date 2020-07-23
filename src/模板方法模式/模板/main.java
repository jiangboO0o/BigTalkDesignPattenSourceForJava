package 模板方法模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端
 * @author: LongJiangBo
 * @create: 2020-07-22 22:26
 **/
public class main {
    public static void main(String[] args) {
        AbstractClass c;

        c = new ConcreteClassA();
        c.TemplateMethod();

        c = new ConcreteClassB();
        c.TemplateMethod();
    }
}
