package 原型模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 具体原型类1
 * @author: LongJiangBo
 * @create: 2020-07-15 21:43
 **/
public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    /**
     * @Description: 创建当前对象的浅表副本。方法是创建一个新对象，然后将当前对象的非静态字段复制到该新对象。
     * 如果字段是值类型的，则对该字段执行逐位复制、如果字段是引用类型，则复制引用但不复制引用的对象；因此原始对象及其副本引用同一对象。
     * @Author: LongJiangBo
     * @param
     * @return: 原型模式.模板.Prototype
     * @Date: 22:18 2020/7/15
    */
    @Override
    public Prototype Clone() throws CloneNotSupportedException {
        return (Prototype)this.clone();
    }
}
