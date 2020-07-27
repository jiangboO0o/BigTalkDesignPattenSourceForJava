package 外观模式;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 外观类，对其他类的方法进行调用打包，总的来说就是在原来直接调用各个类方法的基础上，包一层，让别人看不到具体调用了哪些类。并没有继承的存在，单纯的调用。
 * @author: LongJiangBo
 * @create: 2020-07-27 20:46
 **/
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void MethodA(){
        System.out.println("方法组A --- ");
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }

    public void MethodB(){
        System.out.println("方法组B --- ");
        two.MethodTwo();
        three.MethodThree();
    }
}
