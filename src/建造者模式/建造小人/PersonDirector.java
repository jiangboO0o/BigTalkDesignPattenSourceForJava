package 建造者模式.建造小人;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 指挥者类，用来控制建造过程，隔离用户与建造过程之间的关联
 * @author: LongJiangBo
 * @create: 2020-07-29 21:41
 **/
public class PersonDirector {

    private PersonBuilder personBuilder;

    /**
     * @Description: 构造方法，在这里初始化决定建造瘦小人还是胖小人，或者其他后扩展的小人
     * @Author: LongJiangBo
     * @param personBuilder
     * @return:
     * @Date: 21:46 2020/7/29
    */
    public PersonDirector(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    /**
     * @Description: 建造小人具体需要调用的方法，在这里控制
     * @Author: LongJiangBo
     * @param
     * @return: void
     * @Date: 21:44 2020/7/29
    */
    public void CreatePerson(){
        personBuilder.BuildHead();
        personBuilder.BuildBody();
        personBuilder.BuildArmLeft();
        personBuilder.BuildArmRight();
        personBuilder.BuildLegLeft();
        personBuilder.BuildLegRight();
    }
}
