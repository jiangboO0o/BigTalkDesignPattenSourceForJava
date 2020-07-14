package 代理模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体
 * @author: LongJiangBo
 * @create: 2020-07-10 14:59
 **/
public class Proxy extends Subject {
    RealSubject realSubject;
    @Override
    public void Request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
