package 适配器模式.篮球翻译适配器;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 外籍中锋
 * @author: LongJiangBo
 * @create: 2020-08-31 22:18
 **/
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻(){
        System.out.printf("外籍中锋{0}进攻",name);
    }

    public void 防守(){
        System.out.printf("外籍中锋{0}防守",name);
    }
}
