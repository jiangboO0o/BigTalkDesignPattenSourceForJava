package 工厂方法模式.雷锋工厂;


/**
 * @Description: 工厂方法模式的好处是：简单工厂模式在添加工厂的时候还要修改简单工厂类（写switch的类），工厂方法模式只需要再额外写一个新添类的工厂类实现工厂接口就可以使用工厂的方法了。
 * 雷锋工厂模式下，如果要扩展添加志愿者类，没有了简单工厂类的改动（添加switch，case），只需要再写一个志愿者工厂类实现雷锋工厂接口，并在类内编写方法创建志愿者实例，就可以使用雷锋类下的方法（志愿者类需要继承雷锋类）
 * @Author: LongJiangBo
 * @return:
 * @Date: 21:23 2020/7/15
*/
public interface IFactory {
    LeiFeng CreateLeiFeng();
}
