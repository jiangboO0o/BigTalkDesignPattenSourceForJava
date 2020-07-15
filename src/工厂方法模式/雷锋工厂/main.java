package 工厂方法模式.雷锋工厂;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端方法
 * @author: LongJiangBo
 * @create: 2020-07-15 21:21
 **/
public class main {
    public static void main(String[] args) {
        //创建工厂实例
        IFactory factory = new UndergraduateFactory();
        //调用工厂类接口创建要使用的类的实例
        LeiFeng student = factory.CreateLeiFeng();
        LeiFeng volunteer = factory.CreateLeiFeng();
        //调用方法
        student.BuyRice();
        volunteer.Sweep();
    }
}
