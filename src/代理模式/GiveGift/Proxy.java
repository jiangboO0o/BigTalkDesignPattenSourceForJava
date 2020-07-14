package 代理模式.GiveGift;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 代理类，实际去实现送礼的的人。保存一个引用是的代理可以访问实体，并提供一个与接口类相同的接口，这样代理类就可以用来代替实体。
 * @author: LongJiangBo
 * @create: 2020-07-10 10:35
 **/
class Proxy implements IGiveGift {

    Pursuit gg;

    //new出实际送礼人
    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
