package 代理模式.GiveGift;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 追求者类，实际送礼人，定义代理所代表的的真实实体
 * @author: LongJiangBo
 * @create: 2020-07-10 10:26
 **/
class Pursuit implements IGiveGift {
    SchoolGirl mm;
    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls(){
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers(){
        System.out.println(mm.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate(){
        System.out.println(mm.getName() + "送你巧克力");
    }
}
