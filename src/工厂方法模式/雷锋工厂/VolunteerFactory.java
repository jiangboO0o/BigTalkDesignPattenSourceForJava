package 工厂方法模式.雷锋工厂;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 社区志愿者工厂
 * @author: LongJiangBo
 * @create: 2020-07-15 21:14
 **/
public class VolunteerFactory extends LeiFeng {
    public LeiFeng CreateLeiFeng(){
        return new Volunteer();
    }
}
