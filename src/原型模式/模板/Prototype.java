package 原型模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 原型类
 * @author: LongJiangBo
 * @create: 2020-07-15 21:40
 **/
public abstract class Prototype {
    private String id;

    public Prototype(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @Description: 抽象类的关键是有这样一个克隆方法
     * @Author: LongJiangBo
     * @param
     * @return: 原型模式.模板.Prototype
     * @Date: 21:42 2020/7/15
    */
    public abstract Prototype Clone() throws CloneNotSupportedException;
}
