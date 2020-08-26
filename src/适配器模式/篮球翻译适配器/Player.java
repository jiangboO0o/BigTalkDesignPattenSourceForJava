package 适配器模式.篮球翻译适配器;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 球员
 * @author: LongJiangBo
 * @create: 2020-08-26 22:50
 **/
public abstract class Player {
    protected String name;
    public Player(String name){
        this.name = name;
    }
    //进攻和防守
    public abstract void Attack();
    public abstract void Defense();
}
