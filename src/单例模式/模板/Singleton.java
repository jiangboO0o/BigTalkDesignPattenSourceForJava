package 单例模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 定义一个GetInstance操作，允许客户访问它的唯一实例。GetInstance是一个静态方法，主要负责创建自己的唯一实例
 * @author: LongJiangBo
 * @create: 2020-08-22 13:15
 **/
public class Singleton {

    private static Singleton instance;

    //构造方法让其private，这就堵死了外界利用new创建此类实例的可能
    private Singleton(){}
    //此方法是获得本类实例的唯一全局访问点
    public static Singleton getInstance() {
        //若实例不存在，则new一个新实例，否则返回已有的实例
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
