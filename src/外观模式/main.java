package 外观模式;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端
 * @author: LongJiangBo
 * @create: 2020-07-27 20:52
 **/
public class main {
    public static void main(String[] args) {
        //有雨facade的作用，客户端可以根本不知三个子系统类的作用
        Facade facade = new Facade();
        facade.MethodA();
        facade.MethodB();
    }
}
