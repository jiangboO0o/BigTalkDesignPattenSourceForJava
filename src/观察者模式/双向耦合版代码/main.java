package 观察者模式.双向耦合版代码;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端代码
 * @author: LongJiangBo
 * @create: 2020-08-10 21:25
 **/
public class main {
    public static void main(String[] args) {

        //前台小姐姐童子喆
        Secretary tongzizhe = new Secretary();

        //看股票的同事
        StockObserver tongshi1 = new StockObserver("沙雕1", tongzizhe);
        StockObserver tongshi2 = new StockObserver("沙雕2", tongzizhe);

        //前台记下了两位同事
        tongzizhe.Attach(tongshi1);
        tongzizhe.Attach(tongshi2);

        //发现老板回来
        tongzizhe.setAction("老板回来了！");

        //通知同事，也就是调用同事的Update方法
        tongzizhe.Notify();
    }
}
