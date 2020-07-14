package 代理模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 定义Proxy所代表的真实实体
 * @author: LongJiangBo
 * @create: 2020-07-10 14:58
 **/
public class RealSubject extends Subject {

    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
