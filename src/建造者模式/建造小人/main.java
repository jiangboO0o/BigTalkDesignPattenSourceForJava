package 建造者模式.建造小人;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端代码
 * @author: LongJiangBo
 * @create: 2020-07-29 21:47
 **/
public class main {
    public static void main(String[] args) {
        PersonThinBuilder thin = new PersonThinBuilder();
        PersonDirector thinDirector = new PersonDirector(thin);
        thinDirector.CreatePerson();

        PersonFatBuilder fat = new PersonFatBuilder();
        PersonDirector fatDirector = new PersonDirector(fat);
        fatDirector.CreatePerson();
    }
}
