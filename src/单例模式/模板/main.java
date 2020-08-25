package 单例模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description:
 * @author: LongJiangBo
 * @create: 2020-08-24 21:42
 **/
public class main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2){
            System.out.println("s1,s2相同");
        }
    }
}
