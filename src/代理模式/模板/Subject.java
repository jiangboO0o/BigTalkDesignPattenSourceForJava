package 代理模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 定义了RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy
 * @author: LongJiangBo
 * @create: 2020-07-10 11:27
 **/
abstract class Subject {
    public abstract void Request();
}
