package 模板方法模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 模板抽象类，存放模板的骨架
 * @author: LongJiangBo
 * @create: 2020-07-22 21:27
 **/
public abstract class AbstractClass {

    /*定义并实现了一个模板方法。这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，
    *而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。
    */

    //一些抽象行为，放到子类去实现
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    //模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，他们都推迟到子类实现
    public void TemplateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("");
    }
}
