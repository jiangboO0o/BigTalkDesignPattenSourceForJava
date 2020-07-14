package 代理模式.GiveGift;

/**
 * @Description: 送礼接口类，定义了所有的送礼动作。定义了真实送礼人和代理的共用接口，这样就在任何使用真实送礼人的地方都可以使用代理。
 * @Author: LongJiangBo
 * @Date: 10:22 2020/7/10
*/
public interface IGiveGift {
    //送洋娃娃
    void giveDolls();
    //送花
    void giveFlowers();
    //送巧克力
    void giveChocolate();
}
